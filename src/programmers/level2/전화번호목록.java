package programmers.level2;

import java.util.Arrays;
public class 전화번호목록 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i = 1; i<phone_book.length-1; i++){

            if(phone_book[i].startsWith(phone_book[0])){
                return false;
            }
        }
        return answer;
    }
}
