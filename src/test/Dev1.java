package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dev1 {
    public String solution(String[] votes, int k) {
        String answer ="";
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<votes.length; i++){
            if(map.containsKey(votes[i])){
                map.put(votes[i], map.get(votes[i])+1);
            }
            else
                map.put(votes[i], 1);
        }
        List<Integer> valueList = new ArrayList<>(map.values());
        valueList.sort((s1, s2)->s1.compareTo(s2));

        for(int i = 0; i<k; i++){

        }
        return answer;
    }
}
