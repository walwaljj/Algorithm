package jsh.algorithm.baekjoon.silver;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/6588
 * 골드바흐의 추측
 */

public class Baekjoon6588 {
    static boolean[] nonPrimes = new boolean[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = 0;

        for (int i = 2; i * i < nonPrimes.length; i++) {
            if (!nonPrimes[i]) {
                for (int j = i * i; j < nonPrimes.length; j += i) {
                    nonPrimes[j] = true;
                }
            }
        }

        while (true) {

            num = Integer.parseInt(br.readLine());

            if (num == 0) break;

            for (int i = 3; i <= num / 2; i += 2) {

                if (!nonPrimes[i] && !nonPrimes[num - i]) {
                    bw.write(num + " = " + i + " + " + (num - i) + "\n");
                    break;
                } else if (i > num / 2) {
                    bw.write("Goldbach's conjecture is wrong.\n");
                    break;
                }

            }
        }
        bw.flush();
        bw.close();
    }
}
