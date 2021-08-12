package test;

import java.util.ArrayList;
import java.util.Arrays;

public class dev_2021_2 {
    public static int make_result(int num) {
        switch (num) {
            case 6 : return 1;
            case 5 : return 2;
            case 4 : return 3;
            case 3 : return 4;
            case 2 : return 5;
            default: return 6;
        }
    }
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int correct = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : win_nums) {
            list.add(i);
        }
        for(int i = 0; i<lottos.length; i++) {
            if (lottos[i] == 0)
                zero++;
            else {
                if (list.contains(lottos[i]))
                    correct++;
            }
        }
        answer[0] = make_result(correct + zero);
        answer[1] = make_result(correct);
        return answer;
    }

    public static void main(String[] args) {
        int[] a = 	{44, 1, 0, 0, 31, 25};
        int[] b = {31, 10, 45, 1, 6, 19};
        System.out.println(solution(a, b));
    }
}
