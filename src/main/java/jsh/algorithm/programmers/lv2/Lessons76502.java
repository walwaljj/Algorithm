package jsh.algorithm.programmers.lv2;

import java.util.Stack;

/** https://school.programmers.co.kr/learn/courses/30/lessons/76502
 * 괄호 회전하기
 */
public class Lessons76502 {

    public static boolean chk(StringBuilder sb){

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if(ch == '(' || ch == '[' || ch =='{'){
                stack.push(ch);
            }
            else if ( (ch == ']' || ch == '}' || ch == ')') && !stack.isEmpty()) {
                if(stack.peek() == '[' && ch == ']'){
                    stack.pop();
                }
                else if (stack.peek() == '{' && ch == '}') {
                    stack.pop();
                }
                else if (stack.peek() == '(' && ch == ')') {
                    stack.pop();
                }else {
                    return false;
                }
            }else{
                return false;
            }
        }
        return stack.isEmpty();

    }
    static public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder(s);

            if(chk(sb)){
                answer ++;
            }

            char ch = sb.charAt(0);
            sb.deleteCharAt(0);
            s = String.valueOf(sb.append(ch + ""));

        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
        System.out.println(solution("}]()[{"));
        System.out.println(solution("[)(]"));
        System.out.println(solution("}}}"));

    }
}
