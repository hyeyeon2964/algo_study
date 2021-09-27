package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 계단오르기_dp {
    private static int[] stairs = new int[301];
    private static int[] dp = new int[301];
    private static int result = 0;
    private static int num;

    public static int solution(int[] arr, int index) {

        for (int i = index; i<=num; i++) {

        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        for (int i=1; i<= num; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }
        int cnt = 0;
        for (int i=0; i<=num; i++) {
            if (cnt == 0) {
                dp[i] = Math.max(dp[i-1], dp[i-2]) + stairs[i];
            }

        }

    }
}
