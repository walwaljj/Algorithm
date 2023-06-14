package jsh.algorithm.baekjoon.silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**https://www.acmicpc.net/problem/1260
 * DFS와 BFS
 */
public class Baekjoon1260_2 {

    static int n , m, start, end;
    static boolean[] dfsVisited ;
    static boolean[] bfsVisited ;
    static int[][] map;

   public void dfs(int point){
       dfsVisited[point] = true;
       System.out.printf(point+" ");

       for (int i = 1 ; i <= n; i++) {
           if(map[point][i] == 1 && !dfsVisited[i]){
               dfsVisited[i] = true;
               dfs(i);
           }
       }
   }

   public void bfs(int point){
       Queue<Integer> q = new LinkedList<>();

       // point 방문 처리 후 q에 저장
       bfsVisited[point] = true;
       q.add(point);

        while (!q.isEmpty()){ // map[poll][i] == 1 가 모두 bfsVisited[point] == true 가 될 때 까지 add하고 poll을 반복.
            //먼저 저장된 값을 꺼냄
            Integer poll = q.poll();
            System.out.print(poll + " ");
            // 모든 정점과 연결된 간선확인.
            for (int i = 1 ; i <= n; i++) {
                if(map[poll][i] == 1 && !bfsVisited[i]){
                    //방문 처리 후 q 에 저장
                    bfsVisited[i] = true;
                    q.add(i);
                }
            }
        }
   }

    public static void main(String[] args) {
       Baekjoon1260_2 bj = new Baekjoon1260_2();
        Scanner sc = new Scanner(System.in);

        // 정점
        n = sc.nextInt();
        // 간선
        m = sc.nextInt();

        dfsVisited = new boolean[n + 1];
        bfsVisited = new boolean[n + 1];

        map = new int[n+1][n+1];

        int point = sc.nextInt();

        //--- map 입력 시작
        for (int i = 0; i < m; i++) {
            // 간선 시작
            start = sc.nextInt();
            // 간선 끝
            end = sc.nextInt();

            // 간선이 존재하는 곳 1로 저장.
            map[start][end] = 1;
            map[end][start] = 1;
        }
        //--- map 입력 끝.

        bj.dfs(point);
        System.out.println();
        bj.bfs(point);

    }

}
