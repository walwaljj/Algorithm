package jsh.algorithm.baekjoon.bronze;

import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/9498
* 시험 성적
* */
public class Baekjoon9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = "";
        if(num >= 90){
            str = "A";
        } else if (num >= 80) {
            str = "B";
        } else if (num >= 70) {
            str = "C";
        }else if (num >= 60) {
            str = "D";
        }else {
            str = "F";
        }
        System.out.println(str);
    }
}
