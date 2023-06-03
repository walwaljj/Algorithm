package jsh.algorithm.baekjoon.silver;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * https://www.acmicpc.net/problem/18258
 * 큐 2
 */
public class Baekjoon18258_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();
        String command = "";
        for (int i = 0; i < Integer.parseInt(br.readLine()); i++) {
            command = br.readLine();
            if(command.contains("push")){
                list.add(Integer.parseInt(command.split(" ")[1]));
            } else if (command.contains("front")) {
                if(list.size() != 0){
                    bw.write(list.get(0)+"\n");
                }else {
                    bw.write(-1+"\n");
                }
            } else if (command.contains("pop")) {
                if(list.size() != 0){
                    bw.write(list.remove(0)+"\n");
                }else {
                    bw.write(-1+"\n");
                }
            } else if (command.contains("size")) {
                bw.write(list.size()+"\n");
            } else if (command.contains("empty")) {
                bw.write((list.isEmpty() ? 1 : 0 )+"\n");
            } else if (command.contains("back")) {
                if(list.size() != 0){
                    bw.write(list.get(list.size()-1)+"\n");
                }else {
                    bw.write(-1+"\n");
                }
            }
        }

        bw.flush();
        bw.close();

    }

}
