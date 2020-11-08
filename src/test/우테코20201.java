package test;

public class 우테코20201 {

    public long calculation(long num1, long num2, String op)
    {
        if (op.equals("+"))
            return num1 + num2;
        else if (op.equals("-"))
            return num1 - num2;
         else
            return num1 * num2;

    }
    public long[] solution(String s, String op) {
        int len = s.length() -1;
        long[] answer = new long[len];
        long num1;
        long num2;

        for(int i = 1; i<=len; i++)
        {
            num1 = Long.parseLong(s.substring(0, i));
            num2 = Long.parseLong(s.substring(i));

            answer[i] = calculation(num1, num2,op);

        }

        return answer;
    }

}
