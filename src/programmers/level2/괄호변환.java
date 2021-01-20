package programmers.level2;

import java.util.Stack;

public class 괄호변환 {
    public static boolean isCorrect(String str)
    {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i) == '(')
            {
                stack.push(str.charAt(i));
            }
            else
            {
                if(stack.size() == 0)
                {
                    return false;
                }
                else
                {
                    stack.pop();
                }
            }
        }
        if(stack.size() != 0)
        {
            return false;
        }
        return true;
    }
    public static String[] ft_split(String str)
    {
        int open = 0;
        int close = 0;
        int index = 1;
        String[] arr = new String[2];

        if(str == "")
        {
            arr[0] = "";
            arr[1] = "";
            return arr;
        }

        if(str.charAt(0) == '(')
        {
            open++;
        }
        else
        {
            close++;
        }
        while(true)
        {
            if(open == close || index == str.length())
            {
                break;
            }
            if(str.charAt(index) == '(')
            {
                open++;
            }
            else
            {
                close++;
            }
            index++;
        }
        arr[0] = str.substring(0,index);
        arr[1] = str.substring(index);
        if(index == str.length())
        {
            arr[1]= "";
        }

        return arr;
    }
    public static String makeString(String u)
    {
        String temp = "";
        if(u.length()==2)
        {
            return temp;
        }
        else {
            u = u.substring(1, u.length() - 1);
        }

        for(int i = 0; i<u.length(); i++)
        {
            if(u.charAt(i) == '(')
            {
                temp += ")";
            }
            else
            {
                temp += "(";
            }
        }
        return temp;
    }

    public static String change(String p)
    {
        String answer = "";
        String[] arr = ft_split(p);
        String u = arr[0];
        String v  = arr[1];
        String temp = "";

        if(p.isEmpty())
        {
            return "";
        }
        if(isCorrect(u))
        {
            return u+change(v);
        }
        else
        {
            temp = "(";
            temp += change(v);
            temp += ")";
            temp += makeString(u);

        }
        return temp;
    }
    public static String solution(String p) {
        String answer = "";
        if(p.isEmpty())
        {
            return "";
        }
        answer = change(p);
        return answer;
    }

    public static void main(String[] args) {

//        System.out.println(solution(")("));
//        System.out.println(solution("(()())()"));
        System.out.println(solution("()))((()"));
    }
}
