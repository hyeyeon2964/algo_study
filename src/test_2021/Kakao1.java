package test_2021;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Kakao1 {
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, ArrayList<String>> report_list = new HashMap<>();

        for (int i = 0; i<report.length; i++) { //내가 신고한 신고리스트 작성

            String[] report_id = report[i].split(" ");
            ArrayList<String> temp = new ArrayList<>();

            if (report_list.containsKey(report_id[0])) {
                temp = report_list.get(report_id[0]);
                if (!temp.contains(report_id[1])) { //만약 내가 신고한 목록에 없다면 추가
                    temp.add(report_id[1]);
                    report_list.put(report_id[0], temp);
                }
            }
            else {
                temp.add(report_id[1]);
                report_list.put(report_id[0], temp);
            }
        }
        HashMap<String, Integer> email_list = new HashMap<>();
        int cnt;
        for (int i = 0; i<id_list.length; i++) { //내가 몇번 신고당했는지
            cnt = 0;
            ArrayList<String> temp = new ArrayList<>();
            if (report_list.containsKey(id_list[i])) {
                temp = report_list.get(id_list[i]);
            }
            else
                continue;
            for (int j = 0; j< temp.size(); j++) {
                if (email_list.containsKey(temp.get(j))) {
                    email_list.put(temp.get(j), email_list.get(temp.get(j)) + 1);
                }
                else {
                    email_list.put(temp.get(j), 1);
                }
            }
        }

        for (int i = 0; i<id_list.length; i++) { //신고횟수가 k번 넘은 애들중에 내가 신고한애가 있는지 확인
            for(int j = 0; j<id_list.length; j++) {
                if (report_list.containsKey(id_list[i])) {
                    if (email_list.containsKey(id_list[j]) && email_list.get(id_list[j]) >= k) {
                        if (report_list.get(id_list[i]).contains(id_list[j])) { //내가 신고한 목록에 다른 사람의 아이디가 있으면
                            answer[i]++;
                        }
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};


        System.out.println(Arrays.toString(solution(id_list, report, 2)));
    }
}
