package jsh.algorithm.baekjoon.silver;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2606
 *바이러스
 */
public class Baekjoon2606 {
    static int n, m , count;
    static int[][] map ;

    static boolean[] chk ;

    public void dfs(int point){
        chk[point] = true;

        for (int i = 1; i <= n; i++) {
            if(! chk[i] && map[point][i] == 1){
                count ++;
                dfs(i);
            }
        }
    }
    public static void main(String[] args) {
        Baekjoon2606 bj = new Baekjoon2606();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n + 1][n + 1];
        chk = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            map[start][end] = 1;
            map[end][start] = 1;
         }

        bj.dfs(1);

        System.out.println(count);
    }
}
