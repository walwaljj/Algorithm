package jsh.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/1929
 * 소수 구하기
 */
public class Baekjoon1929 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numList = br.readLine().split(" ");

        int start = Integer.parseInt(numList[0]);
        int end = Integer.parseInt(numList[1]);

        boolean[] isPrime = new boolean[end + 1];

        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i * i <= end; i++) {
            if (!isPrime[i])
                for (int j = i * i; j <= end; j += i) {
                    isPrime[j] = true;
                }
        }

        for (int i = start; i <= end ; i++) {
            if(!isPrime[i]){
                System.out.println(i);
            }
        }
    }

}
