package jsh.algorithm.baekjoon.silver;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/15651
 * N 과 M (3)
 * 백트레킹
 */
public class Baekjoon15651 {

    static int n, m;
    static int[] arr;
    static boolean[] chk;
    static StringBuilder str = new StringBuilder();
    void dfs(int index){
        if(index == m){
            for (int i = 0; i < m; i++) {
                str.append(arr[i] + " ");
            }
            str.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if(!chk[i]){
                arr[index] = i;

                dfs(index + 1);
                chk[i] = true;

                for (int j = 1; j <= n; j++) {
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

        Baekjoon15651 bj = new Baekjoon15651();
        bj.dfs(0);

        System.out.println(str);

    }
}
