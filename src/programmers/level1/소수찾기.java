package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 소수찾기 {
    public static int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];

        arr[0] =0;
        arr[1] = 0;
        for(int i = 2; i<=n; i++){
            arr[i] = i;
        }

        for(int i = 2; i<= Math.sqrt(n); i++){
                if(arr[i] != 0)
                {
                    for(int j = i * i; j <= n; j += i) {
                        arr[j] = 0;
                    }
                }
        }

        for(int i=0; i<n+1; i++){
            if(arr[i] != 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
