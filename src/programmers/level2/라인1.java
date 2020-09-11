package programmers.level2;

import java.util.*;
public class 라인1 {
    public static boolean check (String s, int i) {
        char c = 'a';
        switch (s.charAt(i)){
            case '(' :
                c = ')';
                break;
            case '{' :
                c = '}';
                break;
            case '[' :
                c = ']';
                break;
            case '<' :
                c = '>';
                break;
        }
        for(int j= i+1; j<s.length(); j++){
            if (s.charAt(j) == c){
                return true;
            }
        }
        return false;
    }
    public static int solution(String s) {
        int stackNum = 0;
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i<s.length(); i++){
            switch (s.charAt(i)) {
                case '(': {
                    if(check(s, i)) {
                        stackNum++;
                    }
                    else
                        return  -1;
                    break;
                }
                case '{': {
                    if(check(s, i)) {
                        stackNum++;
                    }
                    else
                        return  -1;
                    break;
                }
                case '[': {
                    if(check(s, i)) {
                        stackNum++;
                    }
                    else
                        return  -1;
                    break;
                }
                case '<': {
                    if(check(s, i)) {
                        stackNum++;
                    }
                    else
                        return  -1;
                    break;
                }
                default:
                    break;
            }
            }

            return stackNum;
    }

    public static void main(String[] args) {
        String s1 = "Hello, world!";
        String s2 = "line [plus]";
        String s3 = "if (Count of eggs is 4.) {Buy milk.}";
        String s4 = ">_<";

        System.out.println(solution(s1));   //0
        System.out.println(solution(s2));   //1
        System.out.println(solution(s3));   //2
        System.out.println(solution(s4));   //-1
    }

}
