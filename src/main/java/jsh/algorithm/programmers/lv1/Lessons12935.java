package jsh.algorithm.programmers.lv1;

import java.util.Arrays;

/**https://school.programmers.co.kr/learn/courses/30/lessons/12935
 * 제일 작은 수 제거하기
 */

public class Lessons12935 {
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
       int min =  arr[0];
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            min = min < arr[i] ? min : arr[i];
        }
        if(min == arr[0]){return new int[]{-1};}

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != min){
                answer[cnt++] = arr[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4,3,2,1})));

    }
}
