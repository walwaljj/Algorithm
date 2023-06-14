package jsh.algorithm.baekjoon.silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**https://www.acmicpc.net/problem/1260
 * DFS와 BFS
 */
public class Baekjoon1260 {

    static  int n, m , start , end, point;
    static int[][] map ;
    static boolean[] dfsVisited;
    static boolean[] bfsVisited;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n + 1][n + 1];
        dfsVisited = new boolean[n + 1];
        bfsVisited = new boolean[n + 1];
        point = sc.nextInt();

        for (int i = 0; i < m; i++) {
            start = sc.nextInt();
            end = sc.nextInt();
            map[start][end] = 1;
            map[end][start] = 1;
        }
        Baekjoon1260 bj = new Baekjoon1260();
        bj.dfs(point);
        System.out.println();
        bj.bfs(point);
    }

     void dfs(int point){
        Stack<Integer> stack = new Stack<>();
        // 시작점 stack에 넣고 방문처리
        stack.push(point);
         dfsVisited[point] = true;
        System.out.print(point+ " ");

        while (!stack.isEmpty()){
            for (int i = 1 ; i <= n; i++) {
                // 탐색할 노드에서 가장먼저 발견되는 자식노드 i의 끝까지 탐색
                if(map[point][i] == 1 && !dfsVisited[i]){
                    stack.push(i);
                    dfsVisited[i] = true;
                    dfs(i);
                }
            }
            // point 에서 이동 가능한 정점(i)가 없어 for문을 벗어나면 스택에서 값을 제거
            stack.pop();
        }
    }

    void bfs(int point){
        Queue<Integer> queue = new LinkedList<>();
        // 시작점을 queue에 넣고 방문 처리
        queue.offer(point);
        bfsVisited[point] = true;

        while (!queue.isEmpty()){
            // queue에서 값을 꺼냄.
            Integer poll = queue.poll();
            System.out.print(poll + " ");
            for (int i = 1; i <= n; i++) {
                // queue 에서 꺼낸 값의 자식 노드를 탐색하고 queue에 저장 및 방문 처리
                if(! bfsVisited[i] && map[poll][i] == 1 ){
                    queue.offer(i);
                    bfsVisited[i] = true;
                }

            } // 꺼낸 값(poll)에서 더 이상 이동할 자식 노드가 없으면 for문 종료
        }

    }

}
