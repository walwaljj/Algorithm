package jsh.algorithm.baekjoon.bronze;

import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2562
 * 최댓값
 */
public class Baekjoon2562 {
    public static void main(String[] args) throws IOException {
        int max = 0;
        int idx = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt();
            if(max < num){
                max = num;
                idx = i+1;
            }
        }

        System.out.println(max+"\n"+idx);

    }
}
