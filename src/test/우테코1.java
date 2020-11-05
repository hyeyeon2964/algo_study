package test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 우테코1 {
    public static int[] solution(int money)
    {
        int[] answer = new int[9];
        Arrays.fill(answer, 0);
        int[] arr = new int[]{50000,10000,5000,1000,500,100,50,10,1};
        for(int i = 0; i<answer.length; i++)
        {
            answer[i] = money / arr[i];
            money = money % arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(50237)));
        System.out.println(Arrays.toString(solution(15000)));
    }
}
