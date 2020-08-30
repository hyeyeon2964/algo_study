package programmers.level3;

import java.util.HashMap;
import java.util.Map;
public class 베스트앨범 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String, Integer> first = new HashMap<>();
        Map<String, Integer> second = new HashMap<>();

        String key="";
        for(int i = 0; i<plays.length; i++){
            key = genres[i];
            if(!first.containsKey(key)){

            }
        }



        return answer;
    }
}
