package jsh.algorithm.programmers.lv1;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12906
 */
public class Lessons12906 {
    static public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        int num = arr[0];
        answer[0] = num;
        int cnt = 0;
        for (int i = 1; i < arr.length; i++) {

            if(arr[i] != num){
                num = arr[i];
                answer[++cnt] = num;
            }
        }
        return Arrays.copyOf(answer,cnt+1);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,1,3,3,0,1,1})));
        System.out.println(Arrays.toString(solution(new int[]{4,4,4,3,3})));

    }
}
