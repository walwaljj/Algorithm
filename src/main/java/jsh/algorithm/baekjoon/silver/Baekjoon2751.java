package jsh.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**https://www.acmicpc.net/problem/2751
 * 수 정렬하기2
 */
public class Baekjoon2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int length = Integer.parseInt(br.readLine());
        int[] numArr = new int[length];
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numArr);

        for (int i : numArr) {
            sb.append(i+"\n");
        }
        System.out.println(sb);
    }
}
