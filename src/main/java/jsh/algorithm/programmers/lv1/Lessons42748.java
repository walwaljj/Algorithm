package jsh.algorithm.programmers.lv1;

import java.util.Arrays;
/*
* https://school.programmers.co.kr/learn/courses/30/lessons/42748
* K번째수

 * */
public class Lessons42748 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] copyArr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(copyArr);
            answer[i] = copyArr[commands[i][2]-1];
        }
        return answer;
    }
    public static void main(String[] args) {
        Lessons42748 ls = new Lessons42748();
        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};

        System.out.println(Arrays.toString(ls.solution(new int[]{1, 5, 2, 6, 3, 7, 4},commands)));
    }
}
