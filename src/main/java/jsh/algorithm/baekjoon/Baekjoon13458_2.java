package jsh.algorithm.baekjoon;

import java.io.*;

public class Baekjoon13458_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int locationNum = Integer.parseInt(br.readLine());
        String[] taskerArr = br.readLine().split(" ");
        String[] supervisorArr = br.readLine().split(" ");
        int count = 0;
        int remain = 0;

        for (int i = 0; i < locationNum; i++) {
            remain = Integer.parseInt(taskerArr[i]) - Integer.parseInt(supervisorArr[0]);
            while (remain > 0){
                remain -= Integer.parseInt(supervisorArr[1]);
                count++ ;
            }
        }

        System.out.println(count + locationNum);
    }
}
