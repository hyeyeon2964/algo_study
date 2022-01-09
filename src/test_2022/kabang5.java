package test_2022;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class kabang5 { //제출코드

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb;
    static boolean[][] v = new boolean[5][49];
    static int result = 0;

    static int solution(String[][] schedule) {
        dfs(0, "", schedule);
        return result;
    }

    static void dfs(int idx, String key, String[][] schedule) {
        if (idx == 5) {
            result++;
            return;
        }
        for (int i = 0, c = schedule[idx].length; i < c; i++) {
            String s = schedule[idx][i];
            if (s.length() == 17) {
                int day1 = day(s.substring(0, 2));
                int time1 = Integer.parseInt(s.substring(3, 5)) * 2 + Integer.parseInt(s.substring(6, 8)) / 30;
                int day2 = day(s.substring(9, 11));
                int time2 = Integer.parseInt(s.substring(12, 14)) * 2 + Integer.parseInt(s.substring(15, 17)) / 30;
                if (!isPoss(day1, time1, 3) || !isPoss(day2, time2, 3)) {
                    continue;
                }
                check(day1, time1, 3, true);
                check(day2, time2, 3, true);
                dfs(idx + 1, key + String.valueOf(i), schedule);
                check(day1, time1, 3, false);
                check(day2, time2, 3, false);
            } else {
                int day1 = day(s.substring(0, 2));
                int time1 = Integer.parseInt(s.substring(3, 5)) * 2 + Integer.parseInt(s.substring(6, 8)) / 30;
                if (!isPoss(day1, time1, 6)) {
                    continue;
                }
                check(day1, time1, 6, true);
                dfs(idx + 1, key + String.valueOf(i), schedule);
                check(day1, time1, 6, false);
            }
        }
    }

    static void check(int day, int time, int size, boolean value) {
        for (int i = 0; i < size; i++) {
            v[day][time + i] = value;
        }
    }

    static boolean isPoss(int day, int time, int size) {
        for (int i = 0; i < size; i++) {
            if (v[day][time + i]) {
                return false;
            }
        }
        return true;
    }

    static int day(String s) {
        if (s.equals("MO")) {
            return 0;
        } else if (s.equals("TU")) {
            return 1;
        } else if (s.equals("WE")) {
            return 2;
        } else if (s.equals("TH")) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) throws Exception {
        //System.out.println(solution(schedule));
    }

}