package jsh.algorithm.baekjoon;

import java.util.Scanner;

public class Baekjoon2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
//        int numList[] = new int[7];
        int numList[] = {12,
                77,
                38,
                41,
                53,
                92,
                85};
        int numList2[] = new int[7];
        int min = numList[0];
        int cnt = 0;
        for (int j = 0; j < 7; j++) {
            if(numList[j] % 2 != 0){
                min = numList[j];
                numList2[cnt++] = numList[j];
                for (int i = 0; i < cnt; i++) {
                    min = min > numList2[i] ? numList2[i] : min;
                }
                sum += numList[j];
            }
        }
        if(sum == 0){
            System.out.println(-1);;
        }

        System.out.println(sum + "\n" + min);
    }


}
