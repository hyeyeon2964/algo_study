package test_2021;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class nhn3 {
    public static int solution(int[][] blocks, int sum, int y, int K) {
        if (y >= blocks.length || K <= 0) {
            return sum;
        }

        int max = sum;
        for (int n = 1; n <= K; n++) {
            int x = blocks[y].length - n;
            if (x < 0) {
                continue;
            }
            max = Math.max(max, solution(blocks, sum + blocks[y][x], y + 1, K - n));
        }

        return max;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] blocks = new int[N][M];
        for (int y = 0; y < N; y++) {
            st = new StringTokenizer(br.readLine());
            for (int x = 0; x < M; x++) {
                blocks[y][x] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution(blocks, 0, 0, K));
    }
}