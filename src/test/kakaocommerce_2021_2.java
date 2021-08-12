package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class kakaocommerce_2021_2 {
    public static boolean arrContains(int[] needs, int[] needsCount) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < needsCount.length; i++) {
            list.add(needsCount[i]);
        }
        int answer = 0;
        for (int i = 0; i < needs.length; i++) {
            if(needs[i] == 1) {
                if (!list.contains(i))
                    return false;
            }
        }
        return true;
    }
    public static int[] makeNeedArr(int r, int[] needsCount) {
        int[] result = new int[r];
        int index = 0;
        int maxIndex = 0;
        for(int i = 0; i< r; i++){
            for(int j = 0; j < needsCount.length; j++) {
                if(needsCount[maxIndex] < needsCount[j])
                    maxIndex = j;
            }
            result[index++] = maxIndex;
            needsCount[maxIndex] = 0;
            maxIndex = 0;
        }

        return result;
    }
    public static int solution(int[][] needs, int r) {
        int answer = 0;
        int[] needsCount = new int[needs.length];
        for(int i = 0; i<needs.length; i++) {
            for(int j = 0; j<needs[i].length; j++)
            {
                if (needs[i][j] == 1)
                    needsCount[j]++;
            }
        }
        System.out.println(Arrays.toString(needsCount));

        int[] needIndex = makeNeedArr(r, needsCount);
        for(int i = 0; i<needs.length; i++){
            if (arrContains(needs[i], needIndex)) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = 	{{1, 0, 0}, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println(solution(arr, 2));
    }
}
