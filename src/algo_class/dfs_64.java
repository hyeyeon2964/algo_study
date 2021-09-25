package algo_class;

public class dfs_64 {

    static int result = 0;
    static int[] check;
    static int[][] graph;
    public static void dfs(int v, int n){
        if (v == n) {
            result++;
        }
        else {
            for (int i = 1; i<=n; i++) {
                if (graph[v][i] == 1 && check[i] == 0) {
                    check[i] = 1;
                    dfs(i, n);
                    check[i] = 0; // 그다음 경우의 수를 위해 다시 0으로 초기화
                }
            }
        }
    }
    public static int solution(int n, int m, int[][] arr) {
        graph = new int[n+1][n+1];
        int a;
        int b;
        int answer = 0;
        check = new int[n+1];
        for(int i = 0; i<m; i++) {
            a = arr[i][0];
            b = arr[i][1];
            graph[a][b] = 1;
        }
        check[1] = 1;
        dfs(1, n);
        return result;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2},{1,3},{1,4},{2,1},{2,3},{2,5}
                ,{3,4},{4,2},{4,5}};

        System.out.println(solution(5, 9, arr));
    }
}
