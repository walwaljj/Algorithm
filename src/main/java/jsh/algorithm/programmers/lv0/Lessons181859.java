package jsh.algorithm.programmers.lv0;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/181859
public class Lessons181859 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Lessons181859().solution(new int[]{0, 1, 1, 1, 0})));
        System.out.println(Arrays.toString(new Lessons181859().solution(new int[]{0, 1, 0, 1, 0})));
        System.out.println(Arrays.toString(new Lessons181859().solution(new int[]{0, 1, 1, 0})));

    }
/*
i의 초기값을 0으로 설정하고 i가 arr의 길이보다 작으면 다음을 반복합니다.

만약 stk이 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
stk에 원소가 있고, stk의 마지막 원소가 arr[i]와 같으면 stk의 마지막 원소를 stk에서 제거하고 i에 1을 더합니다.
stk에 원소가 있는데 stk의 마지막 원소가 arr[i]와 다르면 stk의 맨 마지막에 arr[i]를 추가하고 i에 1을 더합니다.
단, 만약 빈 배열을 return 해야한다면 [-1]을 return 합니다.
 */
    public int[] solution(int[] arr) {

        LinkedList<Integer> list = new LinkedList<>();
        Integer lastNum = null;

        for(int i = 0 ; i < arr.length ; i++){

            if( !list.isEmpty() ) lastNum = list.getLast();

            if( list.isEmpty() || !lastNum.equals(arr[i])) list.add(arr[i]);

            else list.removeLast();
        }

        if( list.size() == 0 ) { return new int[]{-1}; }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
