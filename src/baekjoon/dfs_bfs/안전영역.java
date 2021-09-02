package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 안전영역 {
    static int n;
    static int map[][];
    static int temp[][];
    static int result;
    static boolean visit[][];
    static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visit = new boolean[n][n];
        result = 0;
        max = 0; //배열에서 가장 큰 값

        for(int i = 0; i< n; i++) { //배열 만들기
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(max < map[i][j]) {
                    max = map[i][j];
                }
            }
        }

        int area = 0;
        for(int i = 0; i<max; i++) {
            init_rain(i);
            array_copy(map, temp);
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++) {
                    if (visit[j][k] == false && temp[i][j] != -1) {
                        dfs(i, j, k);
                        area++;
                    }
                }
            }
            result = Math.max(result, area);
        }

    }
    static void array_copy(int[][] a, int[][] b) { //깊은 복사
        for(int i = 0; i<a.length; i++) {
            for(int j = 0; j<a[i].length; j++) {
                b[i][j] = a[i][j];
            }
        }
    }
    static void init_rain(int rain) {
        for(boolean a[]: visit)
            Arrays.fill(a, false);
        for (int i = 0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if (rain < max && temp[i][j] != -1) {
                    temp[i][j] = -1;
                    visit[i][j] = true;
                }
            }
        }
    }
    static void dfs(int rain, int x, int y) {
        visit[x][y] = true;


    }
}
