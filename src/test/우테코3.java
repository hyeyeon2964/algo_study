package test;

public class 우테코3 {
    public static String solution(String s)
    {
        String answer = "";
        char[] arr = new char[26];
        char c = 'Z';
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = c;
            c--;
        }
        for(int i = 0 ; i<s.length(); i++)
        {
            if('A'<= s.charAt(i) && s.charAt(i) <= 'Z')
            {
                int index = (s.charAt(i) - 'A');
                answer += arr[index];
            }
            else if('a'<= s.charAt(i) && s.charAt(i) <= 'z')
            {
                int index = (s.charAt(i) - 'a');
                answer += (char)(arr[index] + 32);
            }
            else
            {
                answer += s.charAt(i);
            }

        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution("I love you"));
    }
}
