package programmers.level2;

import java.util.*;

public class 메뉴리뉴얼 {
    static List<Map<String, Integer>> map = new ArrayList<>();
    static int[] maxCnt = new int[11];

    public static void combi(char[] str, int pos, StringBuilder candi) {
        if (pos >= str.length) {
            int len = candi.length();
            if (len >= 2) {
                int cnt = map.get(len).getOrDefault(candi.toString(), 0) + 1;
                map.get(len).put(candi.toString(), cnt);
                maxCnt[len] = Math.max(maxCnt[len], cnt);
            }
            return ;
        }

        combi(str, pos + 1, candi.append(str[pos]));
        candi.setLength(candi.length()-1);
        combi(str, pos +1, candi);
    }
    public String[] solution(String[] orders, int[] course) {
        for (int i = 0; i<11; i++) { //각 원소의 크기는 10이하의 문자열
            map.add(new HashMap<String, Integer>());
        }
        for (String str : orders) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            combi(arr, 0, new StringBuilder());
        }
        List<String> list = new ArrayList<>();
        for (int len : course) {
            for (Map.Entry<String, Integer> entry : map.get(len).entrySet()) {
                if (entry.getValue() >= 2 && entry.getValue() == maxCnt[len]) {
                    list.add(entry.getKey());
                }
            }
        }
        Collections.sort(list);


        String[] answer = new String[list.size()];
        for (int i = 0; i<list.size(); i++)  {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
