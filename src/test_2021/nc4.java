package test_2021;

import java.util.*;

public class nc4 {

    public static int[] solution(int[][] info) {
        int[] answer;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<info.length; i++) {
            int start = info[i][0];
            int end = info[i][1];
            for (int j = start; j<=end; j++) {
                if (map.containsKey(j)) {
                    map.put(j, map.get(j) + 1);
                }
                else {
                    map.put(j, 1);
                }
            }
        }
        int maxValueInMap=Collections.max(map.values());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : map.keySet()) {
            if (map.get(i) == maxValueInMap) {
                list.add(i);
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }


    public static void main(String[] args) {
        int[][] info = {{1,5}, {3,5}, {7,8}};
        System.out.println(Arrays.toString(solution(info))); // result = 3,4,5

        int[][] info1 = {{1,2}, {2, 3}, {4,5}, {5,6}};
        System.out.println(Arrays.toString(solution(info1))); // result = 2,3
    }
}
