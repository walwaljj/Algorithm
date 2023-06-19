package jsh.algorithm.baekjoon.silver;


import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1012
 * 유기농 배추
 */
public class Baekjoon1012 {

    static int m , n, cnt, start, end;

    static int[][] arr;

    static boolean dfs(int x, int y){

        if(x < 0 || y < 0 || x >= m || y >= n){
            return false;
        }
        if(arr[x][y] == 1){
            arr[x][y] =0;

            dfs(x-1 , y);
            dfs(x+1  , y);
            dfs(x , y-1);
            dfs(x , y+1);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < range; i++) {
            m = sc.nextInt();
            n = sc.nextInt();
            cnt = sc.nextInt();
            arr = new int[51][51];
            int result = 0;

            for (int j = 0; j < cnt; j++) {
                start = sc.nextInt();
                end = sc.nextInt();

                arr[start][end] = 1;

            }

            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    if(dfs(j, k)){
                        result ++;
                    }
                }
            }
            sb.append(result + "\n");
        }
        System.out.println(sb);
    }
}
