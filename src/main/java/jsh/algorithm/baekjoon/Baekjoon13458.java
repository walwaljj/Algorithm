package jsh.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Baekjoon13458 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int locationNum = sc.nextInt();
        int[] tasker = new int[locationNum];

        for (int i = 0; i < locationNum; i++) {
             tasker[i] = sc.nextInt();
        }

        int supervisor = sc.nextInt();
        int assistant = sc.nextInt();

        int count = 0;

        for (int i = 0; i < locationNum; i++) {
            int remain = tasker[i] - supervisor;
            while (remain > 0){
                remain -= assistant;
                count++ ;
            }
        }

        System.out.println(count + locationNum);
    }
}
