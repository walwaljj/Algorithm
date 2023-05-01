package jsh.algorithm.programmers;

import java.util.Arrays;
import java.util.Collections;

public class lessons12933 {

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
        lessons12933 lessons = new lessons12933();
        lessons.solution(118372);
    }


}
