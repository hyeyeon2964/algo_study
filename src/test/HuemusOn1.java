package test;

import java.util.ArrayList;

public class HuemusOn1 { //문제 똑같
    public int solution(int[][] flowers) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<flowers.length; i++){
            int start = flowers[i][0];
            int end = flowers[i][1];
            for(int j = start; j<end; j++){
                if(!list.contains(j)) //list안에 같은 숫자가 없을때 add
                    list.add(j);
            }
        }

        answer = list.size();
        return answer;
    }
}

