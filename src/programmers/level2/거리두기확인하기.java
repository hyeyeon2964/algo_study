//package programmers.level2;
//
//import java.util.Arrays;
//
//public class 거리두기확인하기 {
//    int[] dx = {0, 1, 0, -1};
//    int[] dy = {-1, 0, 1, 0};
//    public static int getManhattanDistance(int r1, int c1, int r2, int c2) {
//
//
//        int result = Math.abs(r1 - r2) + Math.abs(r2 - c2); //맨하튼거리 구하는 공식
//
//        return result;
//    }
//    public static boolean bfs(String[] str, int x, int y) {
//
//
//
//    }
//    public static int check(String[] place) {
//        for (int i = 0; i<5; i++){
//            for (int j = 0; j<5; j++) {
//                if (place[i].charAt(j) == 'P') {
//                    bfs(place, i, j);
//                }
//            }
//        }
//    }
//
//    public int[] solution(String[][] places) {
//        int[] answer = new int[places.length];
//        Arrays.fill(answer, 0);
//
//        for (int i = 0; i<places.length; i++){
//            answer[i] = check(places[i]);
//        }
//        return answer;
//    }
//}
