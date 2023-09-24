package jsh.algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2869 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numList = br.readLine().split(" ");

        int afternoon = Integer.parseInt(numList[0]); // 낮
        int night = Integer.parseInt(numList[1]); // 밤
        int height = Integer.parseInt(numList[2]); // 나무 높이

        int day = (height - afternoon) / (afternoon - night);

        if ((height - afternoon) % (afternoon - night) != 0) {
            day++;
        }

        System.out.println(day + 1);

    }
}
