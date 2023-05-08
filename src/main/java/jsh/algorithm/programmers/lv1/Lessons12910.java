package jsh.algorithm.programmers.lv1;

import java.util.Arrays;

public class Lessons12910 {

    public int[] solution(int[] arr, int divisor) {

        String str = "";

        for(int i = 0 ; i < arr.length ; i ++){
            if(arr[i] % divisor == 0){
                str += arr[i] + " " ;
            }
        }

        if(str.equals("")){
            int[] answer = {-1};
            return answer;
        }

        String[] strArr = str.split(" ");
        int[] answer = new int[strArr.length];

        for (int i = 0; i <strArr.length; i++) {
            answer[i] = Integer.parseInt(strArr[i]);
        }

        Arrays.sort(answer);

        return answer;
    }
    public static void main(String[] args) {
        int[] numbers = {3,2,6};
        Lessons12910 lessons = new Lessons12910();

        System.out.println(Arrays.toString(lessons.solution(numbers, 	10)));
    }
}
