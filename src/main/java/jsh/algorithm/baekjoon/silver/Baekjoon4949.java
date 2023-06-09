package jsh.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * https://www.acmicpc.net/problem/4949
 * 균형잡힌 세상
 */
public class Baekjoon4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        String result = "";


        while (!(str = br.readLine()).equals(".")){
            Stack<Character> stack = new Stack<>();
            boolean isTrue = true;
            for (int i = 0; i < str.length(); i++) {

                if(str.charAt(i) == '(' || str.charAt(i) == '[' ){
                   stack.push(str.charAt(i));
                }
                else if (str.charAt(i) == ')') {
                    if(stack.size() > 0 && stack.peek() == '(' ){
                        stack.pop();
                    }else {
                        isTrue = false;
                        break;
                    }
                }
                else if(str.charAt(i) == ']' ) {
                    if(stack.size() > 0 && stack.peek() == '['){
                        stack.pop();
                    }else {
                        isTrue = false;
                        break;
                    }
                }
            }

            result += isTrue && stack.empty() ? "yes\n" : "no\n";

        }
        System.out.println(result);
    }

}
