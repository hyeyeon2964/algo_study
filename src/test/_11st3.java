package test;

import java.util.ArrayList;

public class _11st3 { //2번

    public int[] solution(String[] S) {
        // write your code in Java SE 8
        int strLen = S[0].length();
        int[] answer;
        if(strLen == 1){
            answer = new int[0];
            return answer;
        }
        for(int i = 0; i<S.length; i++){
            for(int j = i+1; j< S.length; j++){
                for(int k = 0; k < strLen; k++){
                    if(S[i].charAt(k) == S[j].charAt(k)){
                        answer = new int[3];
                        answer[0]= i;
                        answer[1] =j;
                        answer[2] = k;
                        return answer;
                    }
                }
            }
        }
        answer = new int[0];
        return answer;
    }
}
