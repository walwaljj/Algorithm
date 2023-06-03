package jsh.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/1406
 * 에디터
 */
public class Baekjoon1406 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append(br.readLine());
        int n = Integer.parseInt(br.readLine());
        String cmd = "";
        int cursor = sb.length();
        for (int i = 0; i < n; i++) {
            cmd = br.readLine();
            if(cmd.contains("P")){
                sb.insert(cursor,cmd.split(" ")[1]);
                cursor++;
            } else if (cmd.contains("L")) {
                cursor = cursor > 0 ? cursor -1 : 0;
            } else if (cmd.contains("B")) {
                if(cursor > 0){
                 sb.delete(cursor-1,cursor) ;
                 cursor--;
                }
            } else if (cmd.contains("D")) {
            cursor = cursor < sb.length() ? cursor +1 : sb.length();
        }
    }

        System.out.println(sb);
    }
}
