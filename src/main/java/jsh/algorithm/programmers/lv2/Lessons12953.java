package jsh.algorithm.programmers.lv2;

import java.util.Arrays;

public class Lessons12953 {
    public static void main(String[] args) {
        Lessons12953 ls = new Lessons12953();
        System.out.println(ls.solution(new int[]{2,6,8,14}));

    }
    public int solution(int[] arr) {
        int answer = 1;

        Arrays.sort(arr);
        int minNum = arr[0];
        int div = 2;

        if(arr[0] == 1  || arr[1] % arr[0] != 0 ){
            for (int i : arr) {
                answer *= i;
            }
            return answer;
        }

//        for (int i = 2; i <= arr[0] ; i++) {
//            if(minNum % i == 0){
//                minNum /= div;
//                div++;
//            }
//        }
        while (minNum != 1){
            if(minNum % div == 0) {
                minNum /= div;
            }
            div += minNum == 1 ? 0 : 1;
        }

        for (int i = 0; i < arr.length; i++) {
            answer *= arr[i];
            System.out.println(answer);
        }
        return answer / div;
    }
}
