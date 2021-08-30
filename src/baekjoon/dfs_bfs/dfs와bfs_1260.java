package baekjoon.dfs_bfs;

import java.awt.image.ImagingOpException;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class dfs와bfs_1260 {

    static ArrayList<Integer>[] list;
    static boolean[] check;

    static int n;
    static int m;
    static int v;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        check= new boolean[n + 1];


    }

    public static void dfs(int x) {
        if (check[x]) {
            return ;
        }
        check[x] = true; //현재 노드 방문 처리
        for (int i = 0; i< N; i++) {
            if ()
        }

    }
}
