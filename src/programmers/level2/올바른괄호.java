package programmers.level2;

import java.util.Stack;

public class 올바른괄호 {
    boolean solution(String s) {
        boolean answer = true;
        int stackNum = 0;
        Stack<Character> stack = new Stack<>();
        if(s.charAt(0) == ')')
            return false;
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                stack.push(s.charAt(i));
                stackNum++;
            }
            else
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                    stackNum--;
                }
                else
                    return false;
            }

        }
        if (stackNum>0)
            return false;


        return answer;
    }
}
