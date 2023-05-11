package jsh.algorithm.programmers.lv0;

import java.util.Arrays;

public class Lessons120833 {
    public static void main(String[] args) {
        Lessons120833 arrSlice = new Lessons120833();
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;
        System.out.println(Arrays.toString(arrSlice.solution(numbers,num1,num2+1)));
    }
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
