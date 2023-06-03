package jsh.algorithm.baekjoon.bronze;

import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/2490
* 윷놀이
* */
public class Baekjoon2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int count = 0;

        for(int i = 0 ; i < 3 ; i ++){
            for(int j = 0 ; j < 4 ; j ++){
                count += sc.nextInt();
            }
            if(count == 4){
                str += "E\n";
            } else if (count == 1) {
                str += "C\n";
            } else if (count == 2) {
                str += "B\n";
            } else if (count == 3) {
                str += "A\n";
            }else if(count == 0){
                str += "D\n";
            }
            count = 0;
        }
        System.out.println(str);
    }

}
