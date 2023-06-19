package jsh.algorithm.baekjoon.silver;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/15654
 * N 과 M (5)
 */
public class Baekjoon15654 {

    static int n, m;
    static boolean[] chk ;
    static int[] arr;
    static int[] tempArr;
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    void dfs(int idx){

        if(idx == m){
            for (int j = 0; j < m ; j++) {
                sb.append(tempArr[j] + " ");
            }

            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n ; i++) {

            if (!chk[i]) {
                tempArr[idx] = arr[i-1];
                chk[i] = true;
                dfs(idx + 1);
                chk[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Baekjoon15654 bj = new Baekjoon15654();


        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[10001];
        tempArr = new int[10001];
        chk = new boolean[10001];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr = Arrays.copyOf(arr, n);
        Arrays.sort(arr);

        bj.dfs(0);


        System.out.println(sb);
    }
}
