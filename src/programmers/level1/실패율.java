package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class 실패율 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> map = new HashMap<>();

        for(int i = 0; i<stages.length; i++){
            int key = stages[i];
            double value;
            if(key <= N){
                if(!map.containsKey(key))
                    value = 0;
                else
                    value = map.get(stages[i]);
                map.put(key, ++value);
            }

        }

        return answer;
    }
}
