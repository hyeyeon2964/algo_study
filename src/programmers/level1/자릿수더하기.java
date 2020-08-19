package programmers.level1;
import java.util.*;

public class 자릿수더하기 {
        public int solution(int n) {
            int answer = 0;
            if(n <= 100000000) {
                while (n > 0) {
                    answer += n % 10;
                    n = n / 10;
                }
            }
            return answer;
        }
}
