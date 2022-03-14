package test_2022;

import java.util.Arrays;

public class sk2 {
    int[] coin = {1,5,10,50,100,500};
    public int solution(int money, int[] costs) {
        int[] dp = new int[money + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0; i<coin.length; i++) {
            for(int j = coin[i]; j<=money; j++) {
                dp[j] = Math.min(dp[j], dp[j - coin[i]] + costs[i]);
            }
        }

        return dp[money];
    }
    public static void main(String[] args) {

    }
}
