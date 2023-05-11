package jsh.algorithm.programmers.lv2;

import java.util.Arrays;

public class Lessons12953_2 {
    public static void main(String[] args) {
        Lessons12953_2 ls = new Lessons12953_2();
        System.out.println(ls.solution(new int[]{34, 17})); //34
//        System.out.println(ls.solution(new int[]{12, 32, 45, 67, 72}));

    }
    public long solution(int[] arr) {
        long answer = 1;
        Arrays.sort(arr);
        int num1 = arr[0];
        int num2 = arr[1];
        int div = 0;
        int resultValue = 0;

        while (true){
            resultValue = num2 % num1;
            if(resultValue != 0){
                num2 = num1;
                num1 = resultValue;
            }else {
                div = num1;
                for (int i = 0; i <arr.length; i++) {
                    if( arr[i] % div != 0 ) {
                        div = 1;
                        break;
                    }
                }
                break;
            }
        }



        for (int i = 0; i < arr.length; i++) {
            answer *= arr[i] / div;
        }

        return (long)( answer * div );
    }
}
