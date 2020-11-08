package test;

import java.lang.annotation.ElementType;
import java.lang.reflect.Array;
import java.util.*;

public class 우테코2020_6 {

    public String[] solution(String[] logs) {
        String[] answer = {};
        HashMap<String, Integer[]> student = new HashMap<>(); //학생번호, [총 합, 푼 문제수]
        HashMap<String, ArrayList<String[]>> studentGrade = new HashMap<>(); //문제 번호, 점수

        for(int i = 0; i<logs.length; i++) {

            String[] arr = logs[i].split(" ");
            String id = arr[0];
            String subject = arr[1];
            int score = Integer.parseInt(arr[2]);
            if(student.containsKey(id))
            {
                ArrayList<String[]> list  = new ArrayList<>();
                list.add(new String[]{subject, arr[2]});
                studentGrade.put(id, list);
                student.put(id, new Integer[]{student.get(id)[0]+score, student.get(id)[1]++});

            }
            else
            {
                ArrayList<String[]> list  = new ArrayList<>();
                list.add(new String[]{subject, arr[2]});
                studentGrade.put(id, list);
                student.put(id, new Integer[]{score, 1});
            }
        }
        Set<String> keys = student.keySet();
        Set<String> cheating = new LinkedHashSet<>();
        for(String key : keys)
        {
            for(String key1 : keys)
            {
                if(key.equals(key1))
                    continue;
                Integer[] keyStudent = student.get(key);
                Integer[] key1Student = student.get(key1);


                if(keyStudent[1] < 5 || key1Student[1] < 5)
                    continue;
                if(keyStudent[0] == key1Student[0] && keyStudent[1] == key1Student[1])
                {
                    cheating.add(key);
                    cheating.add(key1);
                }
            }

        }

        if (cheating.isEmpty())
            return new String[]{"None"};

        answer = cheating.toArray(new String[cheating.size()]);
        Arrays.sort(answer);
        return answer;
    }
}
