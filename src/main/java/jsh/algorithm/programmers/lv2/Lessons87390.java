package jsh.algorithm.programmers.lv2;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/87390
 * n^2 배열 자르기
 */
public class Lessons87390 {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[n * n];
        int[][] arr = new int [n][n];
        int idx = 0;
        while (n != 0){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = n;
                }
            }
            n--;
        }
        for (int[] numbers : arr) {
            for (int number : numbers) {
                answer[idx++] = number;
            }
        }
        return Arrays.copyOfRange(answer, (int)left,(int)right+1);
    }

    public static void main(String[] args) {
        Lessons87390 ls = new Lessons87390();

        System.out.println(Arrays.toString(ls.solution(3,2,5)));
    }
}
