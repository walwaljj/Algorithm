package jsh.algorithm.baekjoon.silver;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Baekjoon1920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        String[] NList = br.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(NList[i]);
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        String[] MList = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(NList[i]);
            bw.write(binarySearch(arr,target,0,N-1)+"\n");
        }
        bw.flush();
        bw.close();
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return 0;
    }
}