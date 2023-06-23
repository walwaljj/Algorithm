package jsh.algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/2675
 * 문자열 반복
 */
public class Baekjoon2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());
        for (int i = 0; i < len; i++) {
            String line = br.readLine();
            String[] arr = line.split(" ");
            for (int k = 0; k < arr[1].length() ; k++) {
                for (int j = 0; j < Integer.parseInt(arr[0]); j++) {
                    sb.append(arr[1].charAt(k));
                }
            }
            sb.append("\n");

        }
        System.out.println(sb);

    }
}
