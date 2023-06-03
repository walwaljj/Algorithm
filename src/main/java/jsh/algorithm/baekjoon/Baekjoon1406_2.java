package jsh.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

/**
 * https://www.acmicpc.net/problem/1406
 * 에디터
 */
public class Baekjoon1406_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> list = new Stack();
//        LinkedList<String> list = new LinkedList<>();
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        int n = Integer.parseInt(br.readLine());
        String cmd = "";
        int cursor = list.size();

        for (int i = 0; i < n; i++) {
            cmd = br.readLine();
            if(cmd.contains("P")){
                list.add(cursor,cmd.charAt(2));
                cursor ++;

            } else if (cmd.contains("L")) {
                cursor = cursor > 0 ? cursor -1 : 0;

            } else if (cmd.contains("B")) {
                if(cursor > 0){
                 list.remove(cursor-1);
                 cursor--;
                }

            } else if (cmd.contains("D")) {
            cursor = cursor < list.size() ? cursor +1 : list.size();
        }
    }
        for (Character character : list) {
            System.out.print(character);
        }
    }
}
