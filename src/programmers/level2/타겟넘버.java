package programmers.level2;

import java.util.regex.Pattern;

public class 타겟넘버 {
    public static int dfs(int pre, int index, int[] numbers, int target)
    {
        int answer = 0;
        if(index == numbers.length) {
            if (pre == target) {
                return 1;
            } else {
                return 0;
            }
        }
        answer += dfs(pre + numbers[index], index+1, numbers, target); //index++을 하면 후처리 연산으로 현재 index가 들어가게 됌
        answer += dfs(pre - numbers[index], index+1, numbers, target);
        return answer;
    }
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(0, 0, numbers, target);

        return answer;
    }
}
