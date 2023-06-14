package jsh.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 * https://www.acmicpc.net/problem/2667
 *단지번호붙이기
 */
public class Baekjoon2667 {
    
    static int n, m , x, y, count;
    static int[][] map;

    boolean dfs(int x, int y){
        if( x <= -1 || x >= n || y <= -1 || y >= m){
            return false;
        }

        if(map[x][y] == 1){
            count ++;
            map[x][y] = 0;
            dfs(x - 1, y);
            dfs(x + 1, y);
            dfs(x, y - 1);
            dfs(x, y + 1);

            return true;
        }

        return false;
    }
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        x = n;
        y = n;
        m = n;
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(split[j]);
            }
        }

        Baekjoon2667 bj = new Baekjoon2667();
        int result = 0;
        String sb = "";

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if(bj.dfs(i,j)){
                    result++;
                    sb += count+" ";
                    count = 0;
                }
            }
        }

        String[] str = sb.split(" ");

        int[] count = new int[result];

        for (int i = 0; i < result; i++) {
            count[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(count);


        System.out.println(result);
        for (Integer num : count) {
            System.out.println(num);
        }
    }
}
