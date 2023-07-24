package jsh.algorithm.baekjoon.silver;

/*
https://www.acmicpc.net/problem/11724
연결 요소의 개수
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
6 5
1 2
2 5
5 1
3 4
4 6
 */
public class Baekjoon11724 {
    static int vertex, edge, cnt;

    static List<List<Integer>> list;
    static int [][] arr;
    static boolean[] chk;
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        vertex = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());

        list = new ArrayList<>();
        arr = new int [vertex+1][vertex+1];
        chk = new boolean[vertex + 1];

        for (int i = 0; i <= vertex; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) {
            StringTokenizer info = new StringTokenizer(reader.readLine());

            int leftNode  = Integer.parseInt(info.nextToken());
            int rightNode  = Integer.parseInt(info.nextToken());
            list.get(leftNode).add(rightNode);
            arr[leftNode][rightNode] = 1;
            arr[rightNode][leftNode] = 1;

        }


        for (int i = 1; i <= vertex; i++) {
            if(!chk[i]){
                dfs(i);
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static void dfs(int i) {
        if(chk[i]) {return;}
        else{
        chk[i] = true;
        for (int j = 1; j <= vertex; j++) {
//        for (int j = 1; j <= vertex; j++) {
//            if (arr[i][j] == 1) {
            if(list.get(i).contains(j)){
                dfs(j);
            }
        }
        }

    }
}
