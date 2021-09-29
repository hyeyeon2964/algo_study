package test_2021;

import java.util.Arrays;

public class nc3 {
    public static int solution (int[] v, int a, int b) {
        int answer = 0;
//        while (v[v.length-1] > 0) {
//            Arrays.sort(v);
//            v[v.length-1] -= a;
//            for (int i = 0; i<v.length-1; i++) {
//                v[i] -= b;
//                if (v[i] < 0 || v[v.length -1] < 0) {
//                    return answer;
//                }
//            }
//
//            answer += 1;
//
//        }
        int sum = 0;
        for (int i = 0; i<v.length; i++) {
            sum += v[i];
        }
        int energy = 2 + (1*v.length -1);
        int hour = (int) sum / energy;

        int min= v[0];
        for (int i = 0; i<v.length; i++) {
            if (v[i] < hour) {
                min = Math.min(min, v[i]);
            }
        }

        if (min < hour)
            return min;

        return hour;
    }

    public static void main(String[] args) {
        int[] v = {4, 5, 5};
        int[] v1 = {4, 4, 3};
        int[] v2 = {100,1,100};

        System.out.println(solution(v, 2, 1)); // 3
        System.out.println(solution(v1, 2, 1)); // 2
        System.out.println(solution(v2, 2, 2));
    }
}
