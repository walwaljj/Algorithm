package jsh.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1654
 * 랜선 자르기
 */

public class Baekjoon1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        long[] lenArr = new long[len];
        for (int i = 0; i < len; i++) {
            StringTokenizer info = new StringTokenizer(br.readLine());
            lenArr[i] = Long.parseLong(info.nextToken());

        }

        Arrays.sort(lenArr);
        System.out.println(bs(lenArr, n));

    }

    public static long bs(long[] arr, int n){
        long left = 0;
        long right = arr[arr.length - 1];
        long mid = 0;


        while (left < right){
            mid = (left + right) / 2;
            int cnt = 0;

            for (int i = 0; i < arr.length; i++) {
                cnt += (arr[i] / mid);
            }

            if( cnt >= n){
                left = mid + 1;
            } else{
                right = mid ;
            }

        }
        return mid - 1;
    }
}
