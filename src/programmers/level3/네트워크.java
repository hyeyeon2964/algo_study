package programmers.level3;

public class 네트워크 {
    static int[] check;
    public static void dfs(int v, int[][] computers) {

        for (int i = 0; i < computers.length; i++) {
            if (check[i] != 1 && computers[v][i] == 1) {
                check[i] = 1;
                dfs(i, computers);
            }
        }
    }

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        check = new int[n];

        for (int i = 0; i<n; i++){
            if (check[i] != 1) {
                check[0] = 1;
                dfs(i, computers);
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] c = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        System.out.println(solution(3, c));
    }
}
