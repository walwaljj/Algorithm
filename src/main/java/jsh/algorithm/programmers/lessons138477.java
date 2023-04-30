package jsh.algorithm.programmers;

import java.util.Arrays;
import java.util.Collections;

public class lessons138477 {

    public int[] solution(int k, int[] score) {
        Integer[] daily = {};
        int count = 0;
        int[] answer = new int [score.length];
        for(int i = 0 ; i < score.length; i ++){
            count ++;
            daily = new Integer[count];
            for(int j = 0 ; j < count; j++){
                daily[j] = score[j];
            }
            if(k < daily.length) {
                Arrays.sort(daily, Collections.reverseOrder());
                answer[i] = daily[k-1];
            }else{
                Arrays.sort(daily);
                answer[i] = daily[0];
            }
        }
        return answer;
    }

}
