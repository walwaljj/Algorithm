package jsh.algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**https://www.acmicpc.net/problem/10093
 * 숫자
 */
public class Baekjoon10093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strArr = str.split(" ");
        long num1 = Math.min(Long.parseLong(strArr[0]), Long.parseLong(strArr[1]));
        long num2 = Math.max(Long.parseLong(strArr[0]), Long.parseLong(strArr[1]));
        long len = num2 - num1 - 1;
        if(len <= 0){
            System.out.println(0);
        }else {
            List<Long> list = new ArrayList<>();

            for (int i = 0; i < len ; i++) {
                list.add(++num1);
            }

            System.out.println(list.size());

            for (long i : list) {
                System.out.print(i + " ");
            }
        }
    }
}
