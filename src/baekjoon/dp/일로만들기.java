package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 일로만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] dp = new int[1000001];
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;
        for (int i = 4; i<=num; i++) {
            dp[i] = dp[i-1] + 1; //조건 1 1을 뺀다 ->그 전꺼에서 연산횟수 +1
            if (i%2 == 0) { //조건 2  2로 나누어떨어지면 2로 나눈다
                dp[i] = Math.min(dp[i], dp[i/2]+1);// 2로 나누는 연산을 한번 더하는 거기 때문에 +1
            }
            if (i%3 == 0) { //조건 3 3으로 나누어 떨어지면 3으로 나눈다
                dp[i] = Math.min(dp[i], dp[i/3]+1); //3으로 나누는 연산을 한 번 더하는거여서 +1
            }
        }

        System.out.println(dp[num]);
    }
}
