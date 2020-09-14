package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;

public class 월코1 {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();


        for(int i = 0; i< numbers.length; i++){
            sum =0;
            for(int j=i+1; j<numbers.length; j++){
                sum = numbers[i] + numbers[j];
                if(arr.contains(sum)){
                    break;
                }
                else {
                    arr.add(sum);
                }

            }
        }
        int index = 0;
        answer = new int[arr.size()];
        for(int k : arr)
            answer[index++] = k;
        Arrays.sort(answer);

        return answer;
    }
}
