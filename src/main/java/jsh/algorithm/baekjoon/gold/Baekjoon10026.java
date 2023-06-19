package jsh.algorithm.baekjoon.gold;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/10026
 * 적록색약
 */
public class Baekjoon10026 {
    static int num;
    static Character[][] strMap = new Character[101][101];
    static Character[][] strMap2 = new Character[101][101];

    public static boolean dfsB(int x, int y){

        if (chk(x, y)) return false;
        if (strMap[x][y] == 'B') {
            strMap[x][y] = 'b';
            dfsB(x - 1, y);
            dfsB(x + 1, y);
            dfsB(x, y - 1);
            dfsB(x, y + 1);
            return true;
        }
        return false;
    }

    public static boolean dfsG(int x, int y){

        if (chk(x, y)) return false;
        if (strMap[x][y] == 'G') {
            strMap[x][y] = 'g';
            dfsG(x - 1, y);
            dfsG(x + 1, y);
            dfsG(x, y - 1);
            dfsG(x, y + 1);
            return true;
        }
        return false;
    }

    public static boolean dfsR(int x, int y){

        if (chk(x, y)) return false;
        if (strMap[x][y] == 'R') {
            strMap[x][y] = 'r';
            dfsR(x - 1, y);
            dfsR(x + 1, y);
            dfsR(x, y - 1);
            dfsR(x, y + 1);
            return true;
        }
        return false;
    }

    public static boolean dfsRG(int x, int y){

        if (chk(x, y)) return false;
        if (strMap2[x][y] == 'G') {
            strMap2[x][y] = 'g';
            dfsRG(x - 1, y);
            dfsRG(x + 1, y);
            dfsRG(x, y - 1);
            dfsRG(x, y + 1);
            return true;
        }
        return false;
    }

    private static boolean chk(int x, int y) {
        if(x <= -1 || y <= -1 || x >= num || y >= num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < num; j++) {
                strMap[i][j] = str.charAt(j);
                strMap2[i][j] = str.charAt(j);
                if(str.charAt(j) == 'R'){
                    strMap2[i][j] = 'G';
                }

            }
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (dfsRG(i, j)) {
                    cnt4++;
                }

            }
            for (int j = 0; j < num; j++) {
                if (dfsB(i, j)) {
                    cnt1++;
                }
                else if (dfsG(i, j)) {
                    cnt2++;
                }
                else if(dfsR(i, j)){
                    cnt3++;
                }
            }
        }

        System.out.println(cnt1 + cnt2 + cnt3);
        System.out.println(cnt4 + cnt1 );
    }
}
