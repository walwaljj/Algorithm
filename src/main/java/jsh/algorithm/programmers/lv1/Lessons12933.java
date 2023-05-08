package jsh.algorithm.programmers.lv1;

import java.util.Arrays;
import java.util.Collections;

public class Lessons12933 {

    public long solution(long n) {
        String answer = "";
        String[] split = (n + "").split("");
        Arrays.sort(split, Collections.reverseOrder());
        for (String s : split) {
            answer+=s;
        }
        return Long.parseLong(answer);
    }

    public static void main(String[] args) {
        Lessons12933 lessons = new Lessons12933();
        lessons.solution(118372);
    }


}
