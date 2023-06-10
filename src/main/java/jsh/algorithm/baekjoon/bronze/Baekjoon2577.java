package jsh.algorithm.baekjoon.bronze;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2577
 * 숫자의 개수
 */
public class Baekjoon2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int multiply = a * b * c;

        int[] cnt = new int[10];

        while (multiply != 0){
            int i = multiply % 10;
            cnt[i]++;
            multiply /= 10;
        }

        for (int i : cnt) {
            System.out.println(i);
        }
    }
}
