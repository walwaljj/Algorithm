package jsh.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**https://www.acmicpc.net/problem/1927
 * 최소 힙
 */
public class Baekjoon1927 {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        for (int i = 0; i < len; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num == 0){
                if(pq.isEmpty()){
                    sb.append(0+"\n");
                }else {
                    sb.append(pq.poll()+"\n");
                }

            }else
            pq.add(num);

        }
        System.out.println(sb);
    }

}
