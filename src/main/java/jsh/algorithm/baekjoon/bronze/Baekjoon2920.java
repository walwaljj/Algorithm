package jsh.algorithm.baekjoon.bronze;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2920
 */
public class Baekjoon2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isMixed = false;
        String str = "";

        if(num == 1 && !isMixed){
            for (int i = 2 ; i < 9; i++) {
                int ascending = sc.nextInt();
                if( i != ascending){
                    isMixed = true;
                }
                str = "ascending";
            }
        }else if(num == 8 && !isMixed){
            for (int i = 7; i > 0; i--) {
                int descending = sc.nextInt();
                if( i != descending){
                    isMixed = true;
                }
                str = "descending";
            }
        }else{
            for (int i = 2 ; i < 9; i++) {
                sc.nextInt();
                isMixed = true;
            }
        }
        System.out.println(isMixed ? "mixed" : str );
    }
}
