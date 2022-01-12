package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 아기상어 {
    private static int n;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0,0, -1, 1};
    private static int sx;
    private static int sy;
    private static int size;
    static class Info {
        int x;
        int y;
        int dist; //거리

        public Info(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    public static boolean checkRange(int x, int y) {
        return x < 0 || x >= n || y < 0 || y >= n;
    }
    public static int bfs(int start, int[][] graph, boolean[] visited) {
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        int[][] graph = new int[n][n];

        int shark;
        for(int i = 0; i<n; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
            graph[i] = arr;
            size = 2;
            for(int j=0; j<graph[i].length; j++) {
                if(graph[i][j] == 9) {
                    sx = i;
                    sy = j;
                    graph[i][j] = 0;
                }
            }
        }
        boolean[] visited = new boolean[n];
    }
}
