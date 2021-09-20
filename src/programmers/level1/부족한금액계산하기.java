package programmers.level1;

public class 부족한금액계산하기 {
    public static long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        for (int i = 1; i<=count; i++) {
            sum += price * i;
        }
        if (money - sum > 0)
            answer = 0;
        else
            answer = Math.abs(sum - money);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3,20,4));
    }
}
