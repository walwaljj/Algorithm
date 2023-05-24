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

    /**
     * (0,0)(0,1)(0,2)(0,3)
     *   1    2    3    4   x, y
     *   2    2    3    4  (1,3)
     *   3    3    3    4  (2,3)
     *   4    4    4    4  (3,3)
     *
     *   배열을 한줄로 펼치면 아래와 같음.
     *
     *  인덱스 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
     *  값    1 2 3 4 2 2 3 4 3 3 3  4  4  4  4  4
     *
     *  인덱스와 n사이의 관계 : 인덱스 / n = x (몫);
     *                      인덱스 % n = y (나머지);
     *   (0, 3), (1, 3), (2, 3), (3, 3) 과 같이 x 또는 y 둘중 하나라도 n - 1이면 해당 자리의 값은 n
     *   (0, 2), (1, 2), (2, 2), (2, 1) 등과 같이 n-1보다 크지않고,  둘 중 하나라도 n - 2 라면 해당 자리값은 n - 1
     *   (1, 1), (1, 0), (0, 1) 과 같이 n-2보다 크지않고,하나라도 n - 3이면 자리값은 n - 2
     *   ==> 인덱스 / n 와 인덱스 % n 를 구해야함
     *         ㄴ 이건 x (몫)   ㄴ 이건 y (나머지)

     *    몫과 나머지를 비교해 큰 값 + 1 을 answer[idx++] 의 값으로함.
     *
     *
     */
    public static void main(String[] args) {
        Lessons87390_2 ls = new Lessons87390_2();

        System.out.println(Arrays.toString(ls.solution(4,7,14)));
    }
}
