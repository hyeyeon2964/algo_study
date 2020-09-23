package programmers.level1;

public class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        String answer = "";
        int index = 0;
        for(int i = 0; i<seoul.length; i++){

            if(seoul[i].equals("Kim")){
                index = i;
                break;
            }
        }
        String index1 = Integer.toString(index);
        answer = "김서방은 " +  index1 +"에 있다";

        return answer;
    }
}
