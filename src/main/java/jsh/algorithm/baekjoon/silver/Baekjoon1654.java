package jsh.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/1654
 * 랜선 자르기
 */

public class Baekjoon1654 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NMArr = br.readLine().split(" ");
        int K = Integer.parseInt(NMArr[0]);
        long N = Long.parseLong(NMArr[1]);
        long[] lenArr = new long[K];

        for (int i = 0; i < K; i++) {
            lenArr[i] = Long.parseLong(br.readLine());
        }
//        Arrays.sort(lenArr); // 시간초과 해소를 위해 삭제

        System.out.println(binarySearch(lenArr, N));

    }

    public static long binarySearch(long[] lenArr, long N) {
        long start = 1; // /zero 문제 해결을 위해 start 길이를 0 -> 1
        long end = Integer.MAX_VALUE; // 시간초과 개선을 위해 sort 후 lenArr[lenArr.length] -> Integer.MAX_VALUE

        while (start <= end) { // < 일 때 통과가 안 됨..
            long mid = (start + end) / 2;
            long cnt = 0;

            for (int i = 0; i < lenArr.length; i++) {
                cnt += (lenArr[i] / mid); // 구한 mid 길이를 나누고 몫을 cnt 에 더함.
            }

            if (cnt >= N) { // cnt 가 목표 랜선 갯수 N 보다 크거나 같다면
                start = mid + 1; // mid 길이에 +1 을 더함 ==> cnt >= N 이면서 mid 가 최대치 일때 mid 길이를 반환 해야 하기 때문.
            } else {// cnt 가 목표 랜선 갯수 N 보다 작다면
                end = mid - 1; // mid 길이에서 -1 을 함.
            }

        }
        return start - 1; // 또는 end 를 반환해 주면됨.
    }
}
