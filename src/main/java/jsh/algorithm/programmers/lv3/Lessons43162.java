package jsh.algorithm.programmers.lv3;

import java.io.IOException;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/43162
 * 네트워크
 */
public class Lessons43162 {

    static int n ;
    static boolean[] visit = new boolean[200];



    public static void main(String[] args) throws IOException {
        n = 3;
        System.out.println(solution(n, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
//        System.out.println(solution(n, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));

    }

    static public int solution(int n, int[][] computers) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (!visit[i]){
                dfs(i,n,computers);
                answer++;
            }
        }
        return answer;
    }

    static void dfs(int start, int n, int[][] computers){
        visit[start] = true;
        for (int i = 0; i < n; i++) {
            if(computers[start][i] == 1 && !visit[i]){
                dfs(i,n,computers);
            }
        }
    }
}
