package jsh.algorithm.baekjoon.silver;
/**
 * https://www.acmicpc.net/problem/2164
 * 카드2
 */

import java.util.*;

public class Backjoon2164 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        LinkedList<Integer> numbers = new LinkedList<>();
        int cnt = 0;
        Integer number = 0;

        for (int i = 1; i <= num ; i++) {
            numbers.add(i);
        }

        while (numbers.size() != 1){
            number = numbers.removeFirst();
            if(cnt % 2 != 0){
                numbers.addLast(number);
            }
            cnt++;
        }
        System.out.println(numbers.getLast());
    }
}
