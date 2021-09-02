package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연결요소의개수_11724 {
    static int n;
    static int m;
    static boolean visit[];
    static int map[][];
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n+1][n+1];
        visit = new boolean[n+1];
        result = 0;

        for(int i = 0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = 1;
            map[b][a] = 1;
        }
        for(int i = 1; i<n+1; i++){ //연결요소가 몇개인지 세기
            if(visit[i] == false) {
                dfs(i);
                result++;
            }
        }

        System.out.println(result);
    }
    public static void dfs(int x) {
        visit[x] = true;
        for (int i = 1; i<n +1; i++) {
            if (map[x][i] == 1 && visit[i] == false) {
                dfs(i);
            }
        }
    }
}
