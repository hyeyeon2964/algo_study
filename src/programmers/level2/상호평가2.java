//package programmers.level2;
//
//public class 상호평가2 {
////    int[][] scores = {
////            {75, 50, 100},
////            {75, 100, 20},
////            {100, 100, 20}
////    };
////
////    public static String solution(int[][] scores) {
////        int[][] scores = {
////                {75, 50, 100},
////                {75, 100, 20},
////                {100, 100, 20}
////        };
////        public static String solution(int[][] scores) {
////            String answer = "";
////
////            for (int i = 0; i < scores.length; ++i) {
////                int sum = 0;
////                for (int j = 0; j < scores.length; ++j) {
////                    sum += scores[j][i];
////                }
////
////                answer += getRank(isHighestScoreOrLowestScore(scores[i], i)
////                        ? (sum - scores[i][i]) / (scores.length - 1) : (sum / scores.length));
////            }
////
////            return answer;
////        }
////    private static boolean isHighestScoreOrLowestScore(int[] score, int i) {
////        int max = 0;
////        int min = 100;
////        int sameValueCount = 0;
////
////        for (int j = 0; j < score.length; ++j) {
////            max = Math.max(max, score[j]);
////            min = Math.min(min, score[j]);
////            if (score[i] == score[j]) ++sameValueCount;
////        }
////
////        return (max == score[i] || min == score[i]) && sameValueCount < 2;
////    }
////
////}
