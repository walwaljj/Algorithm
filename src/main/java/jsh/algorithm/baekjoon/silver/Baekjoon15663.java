package jsh.algorithm.baekjoon.silver;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/15663
 * N과 M (9)
 */
public class Baekjoon15663 {

    static int n , m;
    static int[] arr = new int[9], temp = new int[9];
    static boolean[] chk = new boolean[9];
    static StringBuilder sb = new StringBuilder();

    static void dfs(int point){
        if(point == m){
            for (int i = 0; i < m; i++) {
                sb.append(temp[i] + " ");
            }
            sb.append("\n");

            return;
        }

        for (int i = 0; i <= n ; i++) {
            if(!chk[i]){
                temp[point] = arr[i];
                chk[i] = true;
                dfs(point + 1);

                chk[i] = false;


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
        Set<String> set = new LinkedHashSet<>(Arrays.asList(String.valueOf(sb).split("\n")));
        for (String s : set) {
            System.out.println(s);
        }
    }
}
