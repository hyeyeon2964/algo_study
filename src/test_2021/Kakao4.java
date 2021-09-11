package test_2021;

import java.util.*;

public class Kakao4 {
    public static int maxGap = 0;
    public static List<int[]> answerList;

    public static int[] solution(int n, int[] info) {
        for (int start = 0; start < info.length - n; start++) {
            combi(info, new int[info.length], 0, n);
        }

        if (answerList == null) {
            return new int[]{-1};
        } else {
            answerList.sort((a1, a2) -> {
                for (int index = info.length - 1; index >= 0; index--) {
                    if (a1[index] > a2[index]) {
                        return -1;
                    } else if (a1[index] < a2[index]) {
                        return 1;
                    }
                }
                return 1;
            });
            return answerList.get(0);
        }
    }

    public static void combi(int[] info, int[] visited, int index, int n) {
        if (n == 0) {
            addScores(info, visited);
            return;
        }
        for (int startIndex = index; startIndex < info.length; startIndex++) {
            for (int number = 0; number <= n; number++) {
                visited[startIndex] = number;
                combi(info, visited, startIndex + 1, n - number);
                visited[startIndex] = 0;
            }
        }
    }

    public static void addScores(int[] apeachArr, int[] ryanArr) {
        int apeachScore = 0;
        int ryanScore = 0;

        for (int index = 0; index < apeachArr.length; index++) {
            int score = apeachArr.length - index - 1;

            if (ryanArr[index] > apeachArr[index]) {
                ryanScore += score;
            } else {
                if (apeachArr[index] > 0) {
                    apeachScore += score;
                }
            }
        }

        if (ryanScore > apeachScore) {
            int gap = ryanScore - apeachScore;
            if (maxGap < gap) {
                maxGap = gap;
                answerList = new ArrayList<>();
                answerList.add(Arrays.copyOf(ryanArr, ryanArr.length));
            } else if (maxGap == gap && !answerList.stream().anyMatch(answer -> Arrays.equals(answer, ryanArr))) {
                maxGap = gap;
                answerList.add(Arrays.copyOf(ryanArr, ryanArr.length));
            }
        }
    }
}
