package jsh.algorithm.baekjoon.silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/11279
 * 최대 힙
 */
public class Baekjoon11279 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int len = Integer.parseInt(br.readLine());

        for (int i = 0; i < len; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(!pq.isEmpty()){
                    System.out.println(pq.poll());
                }else {
                    System.out.println(0);
                    continue;
                }
            }
            pq.add(num);
        }

    }

}
