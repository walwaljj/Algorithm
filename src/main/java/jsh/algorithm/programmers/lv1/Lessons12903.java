package jsh.algorithm.programmers.lv1;

/**https://school.programmers.co.kr/learn/courses/30/lessons/12903
 * 가운데 글자 가져오기
 */
public class Lessons12903 {
    public static String solution(String s) {
        String answer = s.length() % 2 != 0 ? s.substring(s.length()/2,s.length()/2+1) : s.substring(s.length()/2-1,s.length()/2+1);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcde"));//c
        System.out.println(solution("qwer"));//we

    }
}
