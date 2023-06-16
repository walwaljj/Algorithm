package jsh.algorithm.baekjoon.silver;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/15652
 * N 과 M (4)
 * 백트레킹
 */
public class Baekjoon15652 {

    static int n, m;
    static int[] arr;
    static boolean[] chk;
    static StringBuilder sb = new StringBuilder();

    void dfs(int idx){
        if(idx == m){
            for (int i = 0; i < m; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if(!chk[i]){
                arr[idx] = i;

                dfs(idx + 1);
                chk[i] = true;

                for (int j = i + 1; j <= n ; j++) {

                    chk[j] = false;
                }
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        chk = new boolean[n + 1]; // 모든 노드를 다 확인해야함
        arr = new int[m + 1]; //길이가 m이여야 함

        Baekjoon15652 bj = new Baekjoon15652();
        bj.dfs(0);

        System.out.println(sb);

    }
}
