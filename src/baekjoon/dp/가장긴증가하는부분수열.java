package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 가장긴증가하는부분수열 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[length];
        int[] dp = new int[length];
        Arrays.fill(dp, 1);
        for (int i = 0;  i<length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i<length; i++) {

            for(int j = 0; j<i; j++){
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int max = -1;
        for(int i = 0; i < length; i++) {
            max = dp[i] > max ? dp[i] : max;
        }
        System.out.println(max);

    }
}
