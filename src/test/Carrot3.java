package test;

import java.util.Arrays;

public class Carrot3 {
    public static int solution(int[] mmr) {
        int answer = 0;

        Arrays.sort(mmr);
        System.out.println(Arrays.toString(mmr));
        int half = 0;
        int sum = 0;
        for(int i : mmr)
        {
            sum += i;
        }
        half = sum / 2;
        int[] bool = new int[mmr.length];
        int a = mmr[mmr.length-1];
        int count = 1;
        while(half >= a)
        {
            if(half >= a && bool[0] == 0 && count <= (mmr.length/2))
            {
                a += mmr[0];
                bool[0] = 1;
                count++;
            }
            else
            {

            }
        }

        Math.abs(a - (sum - a));

        return answer;
    }

    public static void main(String[] args) {
        int[] mmr = {33, 56, 93, 31, 18, 10, 41, 93};

        System.out.println(solution(mmr));
    }
}
