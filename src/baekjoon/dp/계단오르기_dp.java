package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 계단오르기_dp {
    private static int[] stairs = new int[301];
    private static int[] dp = new int[301];
    private static int num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        for (int i=1; i<= num; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = stairs[1];
        for (int i = 2; i <= num; i++) {
            if(i == 2) {
                dp[2] = stairs[1] + stairs[2];
            }
            else if(i == 3) {
                dp[3] = Math.max(stairs[1], stairs[2]) + stairs[3]; // 초기값 설정
            }
            else {
                dp[i] = Math.max(dp[i - 3]+ stairs[i - 1], dp[i-2]) + stairs[i]; // i-3+i-1과 i-2중에 큰 값을 선택해서 더하는것
            }
        }
        System.out.println(dp[num]);
    }
}
