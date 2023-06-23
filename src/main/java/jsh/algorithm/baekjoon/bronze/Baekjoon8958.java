package jsh.algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**https://www.acmicpc.net/problem/8958
 * OX퀴즈
 */
public class Baekjoon8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        for (int i = 0; i < len; i++) {
            String str = br.readLine();
            int sum = 0;
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 'O') sum += (1 + cnt++);
                else cnt = 0;
            }

            System.out.println(sum);

        }
    }
}
