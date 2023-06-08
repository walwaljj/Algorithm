package jsh.algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**https://www.acmicpc.net/problem/2750
 * 수 정렬하기
 */
public class Backjoon2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int[] numArr = new int[length];
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numArr);

        for (int i : numArr) {
            System.out.println(i);
        }
    }
}
