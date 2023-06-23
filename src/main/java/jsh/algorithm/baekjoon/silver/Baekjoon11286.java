package jsh.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

/**https://www.acmicpc.net/problem/11286
 *  절댓값 힙
 */

public class Baekjoon11286 {

    public static void main(String[] args) throws IOException {

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) < Math.abs(o2))
                    return -1;
                else if (Math.abs(o1) == Math.abs(o2)) {
                    if(o1 < o2){
                        return -1;
                    }else {
                        return 1;
                    }
                }
                return 1;
            }
        });

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());
        for (int i = 0; i < len; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(pq.isEmpty()){
                    sb.append(0+"\n");
                }else{
                    sb.append(pq.poll()+"\n");
                }
            }else pq.add(num);
        }

        System.out.println(sb);

    }
}
