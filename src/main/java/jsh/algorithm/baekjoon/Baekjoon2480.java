package jsh.algorithm.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/2480
* 주사위 세개
* */
public class Baekjoon2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num = 0;

        int[] numList = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
        for (int i = 0; i < numList.length-1; i++) {
            for(int j = i+1 ; j < numList.length ; j++){
                if(numList[i] == numList[j]){
                    count ++;
                    num = numList[i];
                    break;
                }
            }
        }
        if(count == 0){
            Arrays.sort(numList);
            System.out.println(numList[numList.length-1] * 100 );
        }else {

                System.out.println((int) ((100 * Math.pow(10,count)) + (num * (10 *  Math.pow(10,count))) ));

        }


        System.out.println(count);
    }
}
