package baekjoon.dfs_bfs;


import java.io.*;
import java.util.*;

public class dfs와bfs_1260 { //인접행렬 방법

    static boolean[] check;
    static int map[][]; //인접행렬

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
        map = new int[n+1][n+1];
        for(int i = 0; i<n+1; i++){ //변수 초기화
            Arrays.fill(map[i], 0);
        }
        Arrays.fill(check, false);

        for(int i = 0; i<m; i++){ //인접행렬에 값 넣기
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = 1;
            map[b][a] = 1;
        }
        dfs(v);
        Arrays.fill(check, false);
        System.out.println();
        bfs(v);

    }

    public static void dfs(int x) {
        if(check[x] == true) {
            return ;
        }
        check[x] = true; //현재 노드 방문 처리
        System.out.print(x + " ");
        for (int i = 0; i< n + 1; i++) {
            if (map[x][i] == 1 && check[i] == false) { //서로 연결되어있고 아직 방문하지 않았다면 다시 dfs
                dfs(i); //
            }
        }

    }

    public static void bfs(int x){
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(x); //첫 번째 값 넣기
        check[x] = true; //방문 위치 기록
        while (!q.isEmpty()) {
            int temp = q.poll(); // 첫번째 방문위치 빼주기
            System.out.print(temp + " ");

            for(int i = 1; i<=n; i++){
                if(map[temp][i] == 1 && check[i] == false) {
                    q.offer(i); //첫 번째 값과 연결된 값 큐에 넣기
                    check[i] = true; //방문처리
                }
            }
        }

    }
}
