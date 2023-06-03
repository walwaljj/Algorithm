package jsh.algorithm.baekjoon.silver;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/4375
 * 1
 */
public class Baekjoon4375 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            int num = 0;
            for (int count = 1; ; count++) {
                num = num * 10 + 1;
                num %= n;
                if(num == 0){
                    System.out.println(count);
                    break;
                }

            }
        }

    }
}
