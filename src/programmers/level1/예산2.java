package programmers.level1;

import java.util.Arrays;

public class 예산2 {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum = 0;
        for(int i = 0; i<d.length; i++) {
            sum += d[i];
            if(sum <= budget)
                answer++;
        }
        return answer;
    }
    public static void main(String[] args) {

    }
}
