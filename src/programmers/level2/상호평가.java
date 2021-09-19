package programmers.level2;

import java.util.Arrays;

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
    public static String solution(int[][] scores) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<scores.length; i++) {
            int sum = 0;
            boolean check = false;
            int[] temp = scores[i];
            Arrays.sort(temp);
            int max = temp[scores[i].length - 1];
            for (int j = 0; j<scores[i].length; j++) {
                if (i == j && max != scores[i][j]) {
                    check = true;
                }
                if(scores[i][j] == max && i != j) {
                    check = true;
                }
                sum += scores[i][j];
            }
            if (check) {
                sb.append(getSCore(sum / scores[i].length));
            }
            else {
                sb.append(getSCore((sum-max)/scores[i].length - 1));
            }
        }

        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{50,90},{50,87}};
        System.out.println(solution(arr));
    }
}
