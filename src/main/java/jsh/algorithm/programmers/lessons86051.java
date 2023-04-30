package jsh.algorithm.programmers;

import java.util.Arrays;

public class lessons86051 {

    public int solution(int [] numbers) {
        int answer = 45;
        for(int i = 0 ; i < numbers.length ; i ++){
            answer -= numbers[i];
        }


        return answer;
    }
    public static void main(String[] args) {
        lessons86051 lessons = new lessons86051();
        int[] numbers = {1,2,3,4,6,7,8,0};
        lessons.solution(numbers);
    }
}
