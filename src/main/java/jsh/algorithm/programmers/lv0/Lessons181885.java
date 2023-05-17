package jsh.algorithm.programmers.lv0;

/*
* https://school.programmers.co.kr/learn/courses/30/lessons/181885
* 할일 목록
* */

import java.util.Arrays;

public class Lessons181885 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = new String[todo_list.length];
        int count = 0;
        for (int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) answer[count++] = todo_list[i];
        }
        return Arrays.copyOf(answer,count);
    }
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};
        Lessons181885 ls = new Lessons181885();
        System.out.println(Arrays.toString(ls.solution(todo_list, finished)));

    }
}
