package jsh.algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**https://www.acmicpc.net/problem/10809
 * 알파벳 찾기
 */
public class Baekjoon10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int[] arr = new int[26];
        arr = Arrays.stream(arr).map(i -> i = -1).toArray();

        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)-97] == -1)
                arr[str.charAt(i)-97] = i;
        }

        for (int i : arr) {
           sb.append(i+" ");
        }

        System.out.println(sb);
    }
}
