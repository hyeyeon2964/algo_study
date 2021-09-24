package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RGB거리 {
    static int[][] cost;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        dp = new int[num+1][3];
        cost = new int[num+1][3];
        for (int i = 1; i<=num; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j<3; j++) {
                cost[i][j] = Integer.parseInt(temp[j]);
            }
        }
        for (int i = 1; i<= num; i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + cost[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + cost[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + cost[i][2];
        }
        
        int result = Math.min(Math.min(dp[num][0], dp[num][1]), dp[num][2]);
        System.out.println(result);
    }
}
