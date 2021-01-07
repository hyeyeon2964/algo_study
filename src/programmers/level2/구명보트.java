package programmers.level2;

import java.util.Arrays;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        int front = 0;

        for(int i = people.length-1; front<=i; i--)
        {
            if(people[front] + people[i] <= limit)
            {
                front++;
            }
            answer++;
        }
        return answer;
    }
}
