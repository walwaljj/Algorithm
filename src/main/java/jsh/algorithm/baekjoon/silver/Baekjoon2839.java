package jsh.algorithm.baekjoon.silver;

import java.util.Scanner;

/** 설탕 배달
 * https://www.acmicpc.net/problem/2839
 */
public class Baekjoon2839 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sugar = sc.nextInt();
        Baekjoon2839 bj = new Baekjoon2839();
        System.out.println(bj.getResult(sugar));


    }

    public int getResult(int sugar) {

        int plasticBag5 = sugar / 5;
        int result = 0;

        if( sugar == 4 || sugar == 7){
            result = -1;
        }
        else if (sugar % 5 == 0) {
            result = plasticBag5;
        }
        else if (sugar % 5 == 1 || sugar % 5 == 3) {
            result = ( sugar / 5 ) + 1;

        }
        else if (sugar % 5 == 2 || sugar % 5 == 4) {
            result = ( sugar / 5 ) + 2;
        }

        return result;

    }
    /* 규칙을 찾아야함!
     * 3 => 1
     * 4 => -1
     * 5 => 1
     * 6 => 2 ----------> sugar % 5 == 1 인 순간 (sugar / 5 + 1)
     * 7 => -1
     * 8 => 2 ---> 5 + 3 의 배수
     * 9 => 3 --------> sugar % 5 == 4 인 순간 (sugar / 5 + 2)
     * 10 => 2
     * 11 => 3 ----------> sugar % 5 == 1 인 순간 (sugar / 5 + 1)
     * 12 => 4 -------->  sugar % 5 == 2 인 순간 (sugar / 5 + 2)
     * 13 => 3 ----------> sugar % 5 == 3 인 순간 (sugar / 5 + 1)
     * 14 => 4 -------->  sugar % 5 == 4 인 순간 (sugar / 5 + 2)
     * 15 => 3
     * 16 => 4 ---> 5 + 3 의 배수
     * 17 => 5 -------->  sugar % 5 == 2 인 순간 (sugar / 5 + 2)
     * 18 => 4 ----------> sugar % 5 == 3 인 순간 (sugar / 5 + 1)
     * 19 => 5 -------->  sugar % 5 == 4 인 순간 (sugar / 5 + 2)
     * 20 => 4
     * 21 => 5 ----------> sugar % 5 == 1 인 순간 (sugar / 5 + 1)
     */
}
