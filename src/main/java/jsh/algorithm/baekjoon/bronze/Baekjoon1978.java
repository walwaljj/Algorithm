package jsh.algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 소수 찾기
 * https://www.acmicpc.net/problem/1978
 */
public class Baekjoon1978 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        Baekjoon1978 bj = new Baekjoon1978();
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            int num = Integer.parseInt(str[i]);
            if(bj.isPrime(num)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public boolean isPrime(int num){
        boolean result = false;
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                break;
            }
        }
        return result;
    }
}
