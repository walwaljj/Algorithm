package jsh.algorithm.baekjoon.silver;

import java.io.*;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/10816
 * 숫자 카드2
 */
public class Baekjoon10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] NList = new int[N];
        String[] stringNArr = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            NList[i] = Integer.parseInt(stringNArr[i]);
        }
        Arrays.sort(NList);
//        for (int num : NList) {
//            System.out.print(num+" ");
//        }
        int M = Integer.parseInt(br.readLine());
        String[] stringMArr = br.readLine().split(" ");
        br.close();

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(stringMArr[i]);
            bw.write(upperBound(NList, target) - lowerBound(NList, target)+ " ");
        }

        bw.flush();
        bw.close();

    }

    public static int lowerBound(int NList[], int target) {
        int start = 0;
        int end = NList.length;

        while (start < end) {
            int mid = (start + end) / 2;
            if (NList[mid] >= target) {
                end = mid;
            } else
                start = mid + 1;

        }
        return start;
    }
    public static int upperBound(int NList[], int target) {
        int start = 0;
        int end = NList.length;

        while (start < end) {
            int mid = (start + end) / 2; // mid 는 중간 인덱스
            if (NList[mid] > target) { // 타겟 보다 NList[mid] 가 큰경우
                end = mid;
            } else
                start = mid + 1; // 타겟이 크거나 같다면 시작을 늘림.

        }
        return start;
    }
}
