package jsh.algorithm.programmers.lv2;

import java.util.Stack;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12909
 * 올바른 괄호
 */
public class Lessons12909 {
    public static void main(String[] args) {
        System.out.println(solution("()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
        System.out.println(solution("(()("));

    }

    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            else if (s.charAt(i)== ')' && !stack.isEmpty()) { // stack.size() > 0 에서 !stack.isEmpty()로 변경 후 시간초과 문제 해결!
                if (stack.peek() == '(') {
                    stack.pop();
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
