package jsh.algorithm.programmers.lv0;

import java.util.Arrays;

/**https://school.programmers.co.kr/learn/courses/30/lessons/181885?language=java
 * 할 일 목록
 */
public class Lessons120861 {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int xCount = 0;
        int yCount = 0;
        for (int i = 0; i < keyinput.length; i++) {

            if("right".equals(keyinput[i])&& Math.abs(xCount) < board[0]/2 ) { xCount++;}
            else if("left".equals(keyinput[i]) && Math.abs(xCount) < -board[0]/2 ){ xCount--;}
            else if("up".equals(keyinput[i]) && Math.abs(yCount) < board[0]/2){ yCount++;}
            else if("down".equals(keyinput[i]) && Math.abs(yCount) < -board[0]/2){ yCount--;}
            }
        answer[0] = xCount;
        answer[1] = yCount;

        return answer;
    }
    public static void main(String[] args) {
        Lessons120861 ls = new Lessons120861();
       String[] str = {
//               "left", "left", "left", "left", "right", "right", "right", "right"
               "right", "right", "right", "right","left", "left", "left", "left"
        };
       int[] numList = {5,5};
        System.out.println(Arrays.toString(ls.solution(str,numList )));

    }
}
