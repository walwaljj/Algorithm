package jsh.algorithm.baekjoon.bronze;

import java.util.Scanner;

/**https://www.acmicpc.net/problem/2884
 * 알람시계
 */
public class Baekjoon2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int resultM = m - 45;
        int resultH = h - 1 ;
        System.out.printf("%d", resultM > 0 && m != 45 ? h : (resultH >= 0 && m != 45 ? resultH : ( m == 45 ? h : 23)));
        System.out.printf(" %d", resultM > 0 && m != 45 ? resultM : (m == 45 ? 0 : 15 + m));

    }
}
