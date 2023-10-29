package jsh.algorithm.baekjoon.silver;

import java.util.Scanner;

/**
 * 1로 만들기
 * https://www.acmicpc.net/problem/1463
 */
public class Baekjoon1463 {
    static int n = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] nArr = new int[n + 1];
        nArr[1] = 0;

        for (int i = 2; i <= n; i++) {
            
            nArr[i] = nArr[i - 1] + 1; // 1을 빼고, 연산 횟수를 1 증가 시킴
            
            if (i % 2 == 0 && nArr[i] > nArr[i / 2] + 1) { // 2로 나누어 지고, 1로 빼는것 횟수 보다 2로 나누는 횟수가 작다면
                nArr[i] = nArr[i / 2] + 1;
            }
            if (i % 3 == 0 && nArr[i] > nArr[i / 3] + 1) {
                nArr[i] = nArr[i / 3] + 1;
            }
        }

        System.out.println(nArr[n]);
    }

}
