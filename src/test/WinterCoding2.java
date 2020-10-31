package test;

public class WinterCoding2 {
    public String changeStr(String text, String key)
    {
        String result = "";
        for(int i = 0; i<text.length(); i++)
        {
            int value = key.charAt(i) - 96;
            char c = (char)(text.charAt(i) - value);
            if (c < 'a') {
                result += (char)(('z' + 1) - ('a' - c));
            }
            else {
                result += c;
            }

        }
        return result;
    }
    public String rotate(String answer, int rotation)
    {
        String temp = "";
        if(rotation >0)
        {
            for(int i = 0; i<rotation; i++)
            {
                temp = "";
                char a = answer.charAt(0);
                temp += answer.substring(1);
                temp += a;
                answer = temp;
            }
        }
        else
        {
            rotation *= -1;
            for(int i = 0; i<rotation; i++)
            {
                temp = "";
                char a = answer.charAt(answer.length()-1);
                temp += a;
                temp += answer.substring(0, answer.length()-1);
                answer = temp;
            }
        }
        return answer;
    }
    public String solution(String encrypted_text, String key, int rotation) {
        String answer = encrypted_text;

        answer = rotate(answer, rotation);
        System.out.println(answer);
        answer = changeStr(answer, key);
        return answer;
    }
}