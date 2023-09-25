package jsh.algorithm.baekjoon.silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/3273
 * 두 수의 합
 */
public class Baekjoon3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] numArr = str.split(" ");
        int x = Integer.parseInt(br.readLine());
        int cnt = 0;
        int num = 0;
        for (int i = 0; i < len; i++) {
             num = x - Integer.parseInt(numArr[i]);
            if(str.contains(num+"")) {
                cnt++;
            }
        }
        System.out.println(cnt/2);
    }
}
