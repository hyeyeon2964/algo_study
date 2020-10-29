package programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;

public class 오픈채팅방 {
    class Solution {
        public String[] solution(String[] record) {
            String[] answer;
            int answerIndex = 0;
            ArrayList<String[]> history = new ArrayList<>(); //들어오고 나감을 기록
            HashMap<String, String> user = new HashMap<>(); //user의 id와 닉네임을 기록
            for(int i = 0; i<record.length; i++)
            {
                String[] information = new String[3];
                information = record[i].split(" ");

                if (information[0].equals("Enter"))
                {
                        user.put(information[1], information[2]);
                        history.add(new String[]{information[0], information[1]});
                        answerIndex++;
                }
                else if (information[0].equals("Change"))
                {
                    user.put(information[1], information[2]);
                }
                else
                {
                    history.add(new String[]{information[0], information[1]});
                    answerIndex++;
                }
            }

            answer = new String[answerIndex];

            for(int i = 0; i<history.size(); i++)
            {
                if(history.get(i)[0].equals("Enter"))
                {
                    answer[i] = user.get(history.get(i)[1]) + "님이 들어왔습니다.";
                }
                else
                {
                    answer[i] = user.get(history.get(i)[1]) + "님이 나갔습니다.";
                }
            }

            return answer;
        }
    }
    public static void main(String[] args) {

    }
}
