package test;

public class 우테코20202 {
    public int solution(int money, String[] expected, String[] actual) {
        int answer = money;
        int batting = 100;

        for(int i = 0; i <expected.length; i++)
        {
            if (answer == 0)
                return 0;
            if (answer < batting)
            {
                batting = answer;
            }
            if (expected[i].equals(actual[i]))
            {
                answer += batting;
                batting = 100;
            }
            else {
                answer -= batting;
                batting *= 2;
            }
        }

        return answer;
    }
}
