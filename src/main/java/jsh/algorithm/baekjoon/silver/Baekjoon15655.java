package jsh.algorithm.baekjoon.silver;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/15655
 * N과 M (6)
 */
public class Baekjoon15655 {

    static int n, m;
    static int[] arr = new int[9], temp = new int[9];
    static boolean[] chk = new boolean[9];
    static StringBuilder sb = new StringBuilder();
    static void dfs(int point){
        if(point == m){
            for (int i = 0; i < m; i++) {
                sb.append(temp[i]+ " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if(!chk[i]){
                temp[point] = arr[i-1];
                chk[i] = true;
                dfs(point + 1);
                for (int j = 1; j <= n; j++) {
                    if(i < j)
                    chk[j] = false;
                }

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr = Arrays.copyOf(arr,n);
        Arrays.sort(arr);

        dfs(0);
        System.out.println(sb);
    }
}
