package jsh.algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 평균
 * https://www.acmicpc.net/problem/1546
 *
 */
public class Baekjoon1546 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int sum = 0;
        int maxNum = 0;
        String[] numArr = br.readLine().split(" ");

        for (int i = 0; i < cnt; i++) {
            int num = Integer.parseInt(numArr[i]);
            sum += num;
            if(maxNum < num ){
                maxNum = num;
            }
        }

        double abs = (sum /(double) maxNum * 100) / cnt;

        System.out.println(abs);
    }
}
