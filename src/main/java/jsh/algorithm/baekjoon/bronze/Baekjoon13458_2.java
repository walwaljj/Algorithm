package jsh.algorithm.baekjoon.bronze;

import java.io.*;

public class Baekjoon13458_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int locationNum = Integer.parseInt(br.readLine());
        String[] taskerArr = br.readLine().split(" ");
        String[] supervisorArr = br.readLine().split(" ");
        long count = 0l;
        long remain = 0l;

        for (int i = 0; i < locationNum; i++) {
            remain = Long.parseLong(taskerArr[i]) - Long.parseLong(supervisorArr[0]) > 0 ?
                    Long.parseLong(taskerArr[i]) - Long.parseLong(supervisorArr[0]) : 0;
            count += remain / Long.parseLong(supervisorArr[1]);
            count += remain % Long.parseLong(supervisorArr[1]) == 0l ? 0l : 1l ;
        }

        System.out.println(count + locationNum);
    }
}
