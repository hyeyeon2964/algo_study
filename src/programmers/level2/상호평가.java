package programmers.level2;

import java.util.Arrays;
import java.util.Collections;

public class 상호평가 {
    public static String getSCore(int score) {
        if(score >= 90)
            return "A";
        else if(score >=80 && score <90)
            return "B";
        else if (score >= 70 && score < 80)
            return "C";
        else if (score >= 50 && score < 70)
            return "D";
        else
            return "F";
    }
    public static boolean arrCheck(int[] arr, int index, int num) { //중복 값있는지 확인
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == num && i != index)
                return true;
        }
        return false;
    }

    public static boolean check(int[] arr, int index, int max, int min) { //자신에게 준 점수가 max or min인지 확인
        if (arr[index] != max && arr[index] != min)
            return true;

        boolean check;
        if (arr[index] == max)
            return arrCheck(arr, index, max);
        else
            return arrCheck(arr, index, min);

    }
    public static String solution(int[][] scores) {
        String answer = "";
        int index = scores.length;
        StringBuilder sb = new StringBuilder();
        int[][] score = new int[index][index];

        for (int i = 0; i<index; i++) {
            for (int j = 0; j<index; j++) {
                score[i][j] = scores[j][i]; //점수 한 줄로 변경
            }
        }
        for(int i = 0; i<index; i++) {
            int sum = Arrays.stream(score[i]).sum();
            int [] temp = Arrays.copyOf(score[i], score.length);
            Arrays.sort(temp);
            int min = temp[0];
            int max = temp[index - 1];

            if (check(score[i], i, max, min)) {
                sb.append(getSCore(sum/index));
            }
            else {
                if (score[i][i] == max) {
                    sb.append(getSCore((sum - max)/(index - 1)));
                }
                else {
                    sb.append(getSCore((sum - min)/(index - 1)));
                }
            }
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{50,90},{50,87}};
        int[][] scores = {
                {75, 50, 100},
                {75, 100, 20},
                {100, 100, 20}
        };
        System.out.println(solution(scores));
    }
}
