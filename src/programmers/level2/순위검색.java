package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;

public class 순위검색 {
    static ArrayList<ArrayList<String>> infoArr = new ArrayList<ArrayList<String>>();
    static ArrayList<ArrayList<String>> queryArr = new ArrayList<ArrayList<String>>();
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        for (int i = 0; i<info.length; i++) {
            String[] arr = info[i].split(" ");
            ArrayList<String> list = new ArrayList<>();
            for (int j = 0; j<arr.length; j++) {
                list.add(arr[j]);
            }
            infoArr.add(list);
        }

        for (int i = 0; i<query.length; i++) {
            query[i] = query[i].replaceAll("and ", "");
            String[] arr = query[i].split(" ");
            ArrayList<String> list = new ArrayList<>();
            for(int j = 0; j<arr.length; j++) {
                list.add(arr[j]);

            }
            queryArr.add(list);
        }

        int cnt = 0;
        for (int i = 0; i<query.length; i++) {
            ArrayList<String> queryList = queryArr.get(i);
            for (int j = 0; j<infoArr.size(); j++){
                ArrayList<String> infoList = infoArr.get(j);
                if(contains(queryList, infoList)) {
                    cnt++;
                }
            }
            answer[i] = cnt;
            cnt = 0;
        }

        return answer;
    }
    public static boolean contains(ArrayList<String> list1, ArrayList<String> list2) {
        for(int i = 0; i<list1.size()-1; i++) {
            if (list1.get(i).contains("-")) {
                continue;
            }
            if (!list1.get(i).contains(list2.get(i))) {
                return false;
            }
        }
        int a = Integer.parseInt(list1.get(list1.size()-1));
        int b = Integer.parseInt(list2.get(list2.size()-1));
        if (a > b)  {
            return false;
        }
        return true;
    }

}