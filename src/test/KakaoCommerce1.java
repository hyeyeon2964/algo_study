package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KakaoCommerce1 {
    public static void solution(String[] record) {
        String[] answer;
        int index;
        ArrayList<String[]> arr = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        String[] splitRecord;

        for (int i = 0; i < record.length; i++) {
            splitRecord = record[i].split(" ");
            if (map.get(splitRecord[0]).contains(splitRecord[1])) {
                continue;
            }
            if (5 <= map.get(splitRecord[0]).size()) {
                map.get(splitRecord[0]).remove(0);
                map.get(splitRecord[0]).add(splitRecord[1]);
                map.put(splitRecord[0], map.get(splitRecord[0]));
            }
        }

    }
}

