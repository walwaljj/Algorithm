package jsh.algorithm.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/2752
* 세수정렬
* */
public class Baekjoon2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numList = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(numList);
        for (int i : numList) {
            System.out.printf("%d ",i);
        }
    }
}
