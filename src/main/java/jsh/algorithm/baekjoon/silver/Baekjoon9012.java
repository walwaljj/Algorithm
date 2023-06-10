package jsh.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**https://www.acmicpc.net/problem/9012
 * 괄호
 */
public class Baekjoon9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int num = Integer.parseInt(br.readLine());
        String str ="";
        String result = "";
        for (int i = 0; i < num; i++) {
            Stack<Character> stack = new Stack<>();
            str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if(ch == '('){
                    stack.push(ch);
                } else if(ch == ')') {
                   if (stack.size() > 0 && stack.peek() == '(') {
                        stack.pop();
                    }else {
                       stack.push(ch);
                       break;
                   }
                }
            }
            result += stack.isEmpty() ? "YES\n" : "NO\n";
        }
        System.out.println(result);
    }
}
