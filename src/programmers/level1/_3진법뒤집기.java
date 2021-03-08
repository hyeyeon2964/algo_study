package programmers.level1;

public class _3진법뒤집기 {
    public int solution(int n) {
        int answer = 0;
        String num = "";
        while(n < 0){
            num += n % 3;
            n /= 3;
        }
        return answer;
    }
}