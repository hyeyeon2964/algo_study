package programmers.level2;

import java.util.ArrayList;

public class 피보나치수 {
    public int solution(int n) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for(int i = 2; i <= n; i++) {
            list.add(list.get(i-1)+list.get(i-2));
        }

        answer = list.get(n);
        answer %= 1234567;
        return answer;
    }
}