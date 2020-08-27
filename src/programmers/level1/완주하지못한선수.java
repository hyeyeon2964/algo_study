package programmers.level1;

import java.util.Arrays;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i = 0; i<completion.length; i++){
            if(!(participant[i].equals(completion[i]))) {
                answer = participant[i];
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
