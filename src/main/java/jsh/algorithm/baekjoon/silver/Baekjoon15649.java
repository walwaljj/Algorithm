package jsh.algorithm.baekjoon.silver;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/15649
 * N 과 M (1)
 * 백트레킹
 */
public class Baekjoon15649 {

    static int n, m;
    static int[] arr;
    static boolean[] chk;
//    static String str = "";
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
                chk[i] = true;
                dfs(index + 1);
                chk[i] = false;
            }

        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        chk = new boolean[n + 1]; // 모든 노드를 다 확인해야함
        arr = new int[m + 1]; //길이가 m이여야 함

        Baekjoon15649 bj = new Baekjoon15649();
        bj.dfs(0);

        System.out.println(str);

    }
}
