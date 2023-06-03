package jsh.algorithm.baekjoon;

import java.io.*;
import java.util.LinkedList;

/**
 * https://www.acmicpc.net/problem/18258
 * 큐 2
 *
 */
public class Baekjoon18258 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String command = "";
        LinkedList<Integer> ll = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            command = br.readLine();
            if(command.contains("push")){
                ll.add(Integer.parseInt(command.split(" ")[1]));
            } else if (command.contains("front")) {
                sb.append(ll.isEmpty() ? "-1\n" : ll.getFirst()+"\n");
            } else if (command.contains("pop")) {
                sb.append(ll.isEmpty() ? "-1\n" : ll.remove(0)+"\n" );
            } else if (command.contains("size")) {
                sb.append(ll.size()+"\n");
            } else if (command.contains("empty")) {
                sb.append((ll.isEmpty() ? 1 : 0 )+"\n");
            } else if (command.contains("back")) {
                sb.append(ll.isEmpty() ? "-1\n" : ll.getLast()+"\n");
            }
        }
        System.out.println(sb);
    }

}
