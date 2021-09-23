package test_2021;

import java.util.ArrayList;

public class danal2 {
    public static int solution(int mod1, int mod2, int max_range) {
        int answer = 0;
        int i = 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (mod1 * i <= max_range) {
            list.add(mod1 * i);
            i++;
        }

        for (int j = 0; j<list.size(); j++) {
            if (list.get(j) % mod2 != 0)
                answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(4,3,20));
    }
}
