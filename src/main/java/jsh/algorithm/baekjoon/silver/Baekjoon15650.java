package jsh.algorithm.baekjoon.silver;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/15650
 * N 과 M (2)
 * 백트레킹
 */
public class Baekjoon15650 {

    static int n , m ;
    static int [] arr ;
    static boolean[] chk ;

    static StringBuilder sb = new StringBuilder();

    void dfs(int idx){
        if(idx == m){
            for (int i = 0; i < m; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n ; i++) {
            if(!chk[i]){
                arr[idx] = i;
                chk[i] = true;
                dfs( idx + 1);
                for (int j = 1; j <= n; j++) {
                    if(i < j)
                    chk[j] = false;
                }

            }
        }
    }
    public static void main(String[] args) {
        Baekjoon15650 bj = new Baekjoon15650();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m + 1];
        chk = new boolean[n + 1];
        bj.dfs(0);

        System.out.println(sb);

    }
}
