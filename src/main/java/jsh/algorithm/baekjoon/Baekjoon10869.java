package jsh.algorithm.baekjoon;

import java.util.Scanner;
/*
* https://www.acmicpc.net/problem/10869
* 사칙연산
* */
public class Baekjoon10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
    }
}
