package jsh.algorithm.programmers.lv2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42626
 * 더 맵게
 */
public class Lessons42626 {
//    PriorityQueue
    public static int solution(int[] scoville, int K) {
        int answer = 0, next, min, mix = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.stream(scoville).boxed().collect(Collectors.toList()));

        while ( pq.size() >=2 ){

            min = pq.poll();
            next = pq.poll();

            mix = min + (next * 2);

            pq.offer(mix);

            answer ++;

            if(pq.peek() >= K){
                return answer;
            }

        }

        if(pq.isEmpty()){

            if(mix == 0 || K == 0 ) return 0;
            else if(mix < K) return -1;
        }

        return pq.peek() >= K ? pq.peek() : -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0,1, 2},1));

    }
}
