package jsh.algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**https://www.acmicpc.net/problem/1157
 * 단어 공부
 */
public class Baekjoon1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];

        String str = br.readLine().toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            arr[Integer.valueOf(str.charAt(i))-97] += 1 ;
        }

        int maxIdx = 0;
        int maxVal = 0;
        for (int i = 0; i < arr.length; i++) {
            if(maxVal < arr[i]){
                maxVal = arr[i];
                maxIdx = i;
            }
        }

        boolean b = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == maxVal && i != maxIdx){
                b = false;
            }

        }

        System.out.println( b ? (char)(maxIdx + 'A' ) : "?");
    }
}
