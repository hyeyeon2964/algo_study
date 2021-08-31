package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 바이러스 {

    public static boolean check[];
    public static int[][] map;
    public static int result;

    public static int computer;
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        computer = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());
        result = 0;
        map = new int[computer + 1][computer + 1];
        check = new boolean[computer + 1];

        Arrays.fill(check, false);
        for(int i = 0; i<computer+1; i++){ //변수 초기화
            Arrays.fill(map[i], 0);
        }

        for(int i = 0; i <n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = 1;
            map[b][a] = 1;
        }
        //dfs(1);
        bfs(1);
        System.out.println(result-1);
    }
//    public static void dfs(int x) {
//        if (check[x] == true) {
//            return ;
//        }
//        check[x] = true;
//        result++;
//        for(int i = 1; i<computer + 1; i++){
//            if (map[x][i] == 1 && check[i] == false) {
//                dfs(i);
//            }
//        }
//    }

    public static void bfs(int x){
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(x); //첫 번째 값 넣기
        check[x] = true; //방문 위치 기록
        while (!q.isEmpty()) {
            int temp = q.poll(); // 첫번째 방문위치 빼주기
            result++;
            for(int i = 1; i<=n; i++){
                if(map[temp][i] == 1 && check[i] == false) {
                    q.offer(i); //첫 번째 값과 연결된 값 큐에 넣기
                    check[i] = true; //방문처리
                }
            }
        }

    }
}
