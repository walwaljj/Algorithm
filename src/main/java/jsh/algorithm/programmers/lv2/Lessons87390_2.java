package jsh.algorithm.programmers.lv2;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/87390
 * n^2 배열 자르기
 */
public class Lessons87390_2 {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left) + 1];
        int idx = 0;

        for (long i = left, j = right ; i <= right; i++, j--) {
            long num = i / n >= i % n ? i / n : i % n;
            answer[idx++] =(int)( num + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Lessons87390_2 ls = new Lessons87390_2();

        System.out.println(Arrays.toString(ls.solution(4,7,14)));
    }
}
