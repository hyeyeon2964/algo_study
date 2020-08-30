package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class 위장 {
    public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i<clothes.length; i++){
            if(map.containsKey(clothes[i][1])){ //map에 이 키 값이 있으면 value+1
                map.replace(clothes[i][1], map.get(clothes[i][1])+1);
            }
            else //없으면 키값, value 1로 초기화
                map.put(clothes[i][1], 1);
        }
        for(String key : map.keySet()){
            answer *= map.get(key)+1;
        }

        return answer-1;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        solution(clothes);
    }
}
