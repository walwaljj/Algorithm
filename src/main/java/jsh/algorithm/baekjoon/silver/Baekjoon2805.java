package jsh.algorithm.baekjoon.silver;

import java.io.*;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/2805
 * 나무 자르기
 */
public class Baekjoon2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NMarr = br.readLine().split(" ");
        int N = Integer.parseInt(NMarr[0]);
        int M = Integer.parseInt(NMarr[1]);

        int[] NArr = new int[N];
        String[] stringNArr = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            NArr[i] = Integer.parseInt(stringNArr[i]);
        }

        Arrays.sort(NArr);
        System.out.println(binary(NArr, 0, NArr[N - 1], M));

    }

    public static int binary(int[] NArr, int start, int end, int M) {

        while (start < end) { // 최소 길이가 최대 길이를 넘지 않을 때 까지 반복
            int mid = (start + end) / 2;
            long sum = 0;
            for (int i = 0; i < NArr.length; i++) {
                if(NArr[i] > mid){ // 배열의 i 번째 길이가 mid 길이 보다 크다면
                    sum += NArr[i] - mid; // mid 길이 만큼 자르고 남은 윗 부분을 sum 함 => M 비교
                }
            }
            if (sum < M) { // 잘린 나무의 합이 M 보다 작다면 많이 자른것.
                end = mid; // 최대 길이를 mid 길이로 초기화
            }else{
                start = mid + 1; // 잘린 나무의 합이 M 보다 크거나 같다면 시작 길이를 mid 에서 +1 시킴.
            }
        }
        return start - 1; // (start < end) 이 되어 반복문이 끝남 -> 반복문 마지막에 sum >= M 이 되어 else 문 실행.
                            // start = mid + 1; 이 되었음 -> start -1 반환
    }
}
