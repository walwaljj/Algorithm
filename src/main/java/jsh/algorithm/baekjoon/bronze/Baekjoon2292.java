package jsh.algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2292 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int roomNum = 0;
        int nextMultiply = 0;
        int cnt = 1;
        while (num > roomNum) {
            roomNum = (6 * nextMultiply) + 1;
            nextMultiply = nextMultiply + cnt++;
        }
        System.out.println(cnt-1);
    }
}
