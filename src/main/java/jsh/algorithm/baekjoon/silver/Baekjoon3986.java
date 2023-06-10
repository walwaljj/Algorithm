package jsh.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**https://www.acmicpc.net/problem/3986
 *좋은 단어
 */
public class Baekjoon3986 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        String str = "";
        int cnt = 0;

        for (int i = 0; i < len; i++) {
            str = br.readLine();
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if(stack.isEmpty() || stack.peek() != ch){
                    stack.push(ch);
                } else{
                    stack.pop();
                }

            }
            cnt += stack.isEmpty() ? 1 : 0 ;
        }
        System.out.println(cnt);
    }

}
