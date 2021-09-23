package test_2021;

import java.util.Arrays;

public class danal3 {
    public static int solution(int n, int[] v) {
        int answer = Integer.MIN_VALUE;
        int max = 0;
        int min = 0;
        int index = n - 1;

        for (int i = 0; i<n-1; i++) {
            int[] temp = Arrays.copyOfRange(v, i + 1, n);
            min = Arrays.stream(temp).min().getAsInt();
            answer = Math.max(answer, (v[i]-min));
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] v = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(solution(n, v));
    }
}
