package jsh.algorithm.baekjoon.silver;

import java.io.*;
import java.util.Arrays;

public class Baekjoon10815 {
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

        int M = Integer.parseInt(br.readLine());
        String[] stringMArr = br.readLine().split(" ");
        br.close();

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(stringMArr[i]);
            bw.write(binarySearch(NList, 0, N - 1, target) + " ");
        }

        bw.flush();
        bw.close();
    }

    public static int binarySearch(int arr[], int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            int num = arr[mid];
            if (num == target) {
                return 1;
            } else if (num < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }
}
