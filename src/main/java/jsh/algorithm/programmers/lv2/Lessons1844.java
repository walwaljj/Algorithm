package jsh.algorithm.programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class Lessons1844 {
    static int n, m;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = { 0, 0,-1, 1};
    static boolean[][] visited;

    int answer;

    public static boolean checkBounds(int x, int y){
        return -1 < x && x < n && -1 < y && y < m;
    }

    public static int bfs(int maps[][]){
        Queue<int[]> queue = new LinkedList<>(); //인접리스트
        queue.offer(new int[]{0 , 0, 1}); // 현재x 위치, y위치, ㅇㅣ동 칸 수

        visited[0][0] = true; // 0,0 에서 시작 == 이미 방문함.

        while (!queue.isEmpty()){
            int[] now = queue.poll(); // 리스트 안 배열에 값을 넣기 위해 꺼냄.
            int nowX = now[0]; // 현재 x 좌표
            int nowY = now[1]; // 현재 y 좌표
            int steps = now[2]; // 항상 1씩 이동예정

            if(nowX == n - 1 && nowY == m -1){ // 적은 배열의 가장 끝에 있음.
                                                // 즉, 적에게 왔을 때
                return steps;                   // 이동한 step을 리턴
            }

            for (int i = 0; i < 4; i++) { // 현재 위치에서 상하좌우 이동가능하기 때문
                int nextX = nowX + dx[i]; // x 좌표를 1 , -1
                int nextY = nowY + dy[i]; // y 좌표를 1, -1 해보기
                if(
                        checkBounds(nextX, nextY) &&    // 상하좌우 이동 가능하고(배열을 넘어서지 않고)
                            maps[nextX][nextY] == 1 && // 이동 가능한 곳이거나
                            !visited[nextX][nextY] // 방문하지 않았으면
                ){
                    queue.add(new int[]{nextX,nextY,steps + 1}); // 인접리스트에 추가함.
                    visited[nextX][nextY] = true; // 방문처리
                }
            }
        }

        return -1; // 큐가 비어 반복문이 끝났음에도 적에게 도달하지 못해 steps 가 반환되지 않았을때
                        // == 적 주변에 map[nextX][nextY] == 1 이 없어 다가가지 못하는 상황. -1 리턴
    }
    public int solution(int[][] maps) {
        answer = 0;
        n = maps.length ;
        m = maps[0].length ;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Lessons1844().solution(new int[][]{
                {1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}}));
    }
}
