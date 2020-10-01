package programmers.level1;


import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d); // 오름차순으로 정렬
        for(int i = 0; i<d.length; i++){
            if(sum + d[i] <= budget){
                answer++;
                sum += d[i];
            }
            else
                break;
        }
        return answer;
    }
}
