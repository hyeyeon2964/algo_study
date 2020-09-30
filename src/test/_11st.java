package test;

import java.util.ArrayList;

public class _11st { //3번
    public int solution(int[] A) {
        // write your code in Java SE 8
        int answer = 0;
        int[] arr = new int[A.length+1];

        for(int i : A)
            arr[i]++;

        for(int i = 1; i<arr.length; i++){
            if(arr[i] >= 2 || arr[i] ==0){
                for(int j = i+1; j<arr.length; j++){
                    if(arr[i] == 1)
                        break;
                    if(arr[i] >= 2 && arr[j] ==0){
                        answer += Math.abs(j - i);
                        arr[i]--;
                        arr[j]++;
                    }
                    else if (arr[j] >= 2 && arr[i] ==0){
                        answer+= Math.abs(j - i);
                        arr[i]++;
                        arr[j]--;

                    }
                }
            }
        }

        if(answer > 1000000000)
            return -1;

        return answer;
    }
}
