package test;

import java.util.ArrayList;

public class Dev3 {
    public int solution(int n, int[][] groups) {
        int answer = 0;
        int result = 0;
        int len =0;
        int[] arr = new int[4];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<groups.length; i++){
            for(int j = groups[i][0]; j<=groups[i][1]; j++){
                if(list.contains(j)){
                    list.add(j);
                }

            }
        }
        return answer;
    }
}
