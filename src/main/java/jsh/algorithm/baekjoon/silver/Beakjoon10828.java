package jsh.algorithm.baekjoon.silver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * https://www.acmicpc.net/problem/10828
 * 스택
 */
public class Beakjoon10828 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> list = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (str.contains("push")){
                list.add(Integer.parseInt(str.split(" ")[1]));
            } else if (str.contains("top")) {
                System.out.println(list.isEmpty() ? -1 : list.getLast());
            } else if (str.contains("size")) {
                System.out.println(list.size());
            } else if (str.contains("empty")) {
                System.out.println(list.isEmpty() ? 1 : 0);
            } else if (str.contains("pop")) {
                System.out.println(list.isEmpty() ? -1 : list.removeLast());
            }
        }
    }
}