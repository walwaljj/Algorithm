package jsh.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*

https://www.acmicpc.net/problem/11725
트리의 부모 찾기

 */
public class Baekjoon11725 {

    static int pNode;

    static List<List<Integer>> list;
    static boolean[] chk;

    static int[] result;


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int nodeNum = Integer.parseInt(st.nextToken());
        list = new LinkedList<>();
        result = new int[nodeNum];
        chk = new boolean[nodeNum];
        for (int i = 0; i <= nodeNum; i++) {
            list.add(new LinkedList<>());
        }

        for (int i = 1 ; i < nodeNum; i++) {
            StringTokenizer info = new StringTokenizer(reader.readLine());
            int node1 = Integer.parseInt(info.nextToken());
            int node2 = Integer.parseInt(info.nextToken());
            list.get(node1).add(node2);

        }

        dfs(1);

        for (int i = 2; i < nodeNum; i++) {
            System.out.println(result[i]);
        }
    }

    public static void dfs(int node){
        chk[node] = true;
        for (Integer integer : list.get(node)) {
            if ( !chk[integer]) {
                dfs(integer);
                result[integer] = node;
            }
        }



    }
}
