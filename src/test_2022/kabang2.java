package test_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class kabang2 {
    public static boolean check (String s) {
        boolean result = true;
        int stackNum = 0;
        Stack<Character> stack = new Stack<>();
        if(s.length() == 0) {
            return true;
        }
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

        return result;
    }
    public static long solution(String[] arr1, String[] arr2) {
        long answer = 0;

        ArrayList<String> checkArr1 = new ArrayList<>();
        ArrayList<String>  checkArr2 = new ArrayList<>();
        int correctArr1 = 0;
        int correctArr2 = 0;

        for(int i = 0; i<arr1.length; i++) {
            if(check(arr1[i]))
                correctArr1++;
            else {
                if(arr1[i].charAt(0) != ')') {
                    checkArr1.add(arr1[i]);
                }
            }
        }
        for(int i = 0; i<arr2.length; i++) {
            if(check(arr2[i]))
                correctArr2++;
            else {
                if(arr2[i].charAt(arr2[i].length()-1) != '(') {
                    checkArr2.add(arr2[i]);
                }
            }
        }

        for(int i = 0; i<checkArr1.size(); i++) {
            for(int j = 0; j<checkArr2.size(); j++) {
                StringBuilder sb = new StringBuilder();
                sb.append(checkArr1.get(i));
                sb.append(checkArr2.get(j));
                if(check(sb.toString()))
                    answer++;
            }
        }

        answer += (correctArr1 * correctArr2);


        return answer;
    }
//
//    public static long solution(String[] arr1, String[] arr2) {
//        long answer = -1;
//        ArrayList<String> correct = new ArrayList<>();
//        ArrayList<String> fail = new ArrayList<>();
//        for(int i = 0; i<arr1.length; i++) {
//            if(arr1[i].charAt(0) == ')')
//                continue;
//            for(int j = 0; j<arr2.length; j++) {
//                if(arr2[j].charAt(arr2[j].length()-1) == '(')
//                    continue;
//                StringBuilder sb = new StringBuilder();
//                sb.append(arr1[i]);
//                sb.append(arr2[j]);
//                if(correct.contains(sb.toString())) {
//                    answer++;
//                    continue;
//                }
//                if(fail.contains(sb.toString())) {
//                    continue;
//                }
//                if(check(sb.toString())) {
//                    correct.add(sb.toString());
//                    answer++;
//                }
//                else {
//                    fail.add(sb.toString());
//                }
//            }
//        }
//        return answer;
//    }
    public static void main(String[] args) {
        String[] arr1 = {"()", "(()", "(", "(())"};
        String[] arr2 = {")()", "()", "(())", ")()"};
        System.out.println(solution(arr1, arr2));
    }
}
