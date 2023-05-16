package jsh.algorithm.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/2753
* 윤년
* */
public class Baekjoon2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int i = 0;
        i = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ? 1 : 0;
        System.out.println(i);

    }
}
