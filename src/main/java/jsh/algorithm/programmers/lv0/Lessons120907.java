package jsh.algorithm.programmers.lv0;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120907
 * OX퀴즈
 */
public class Lessons120907 {
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");
                if(str[1].equals("-")){
                    answer[i] = Integer.parseInt(str[0]) - Integer.parseInt(str[2]) == Integer.parseInt(str[4]) ?
                            "O" : "X";
                } else if (str[1].equals("+")) {
                    answer[i] = Integer.parseInt(str[0]) + Integer.parseInt(str[2]) == Integer.parseInt(str[4]) ?
                            "O" : "X";
                }
            }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"})));
        System.out.println(Arrays.toString(solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})));

    }


}
