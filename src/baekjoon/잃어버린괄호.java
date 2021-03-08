package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;
public class 잃어버린괄호 {
    public static String subString(String str, int index)
    {
        int end = index;
        for(int i = index; i<str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                end++;
            } else
                break;
        }
        return str.substring(index, end);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int len = 0;
        int sum =0;
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i<str.length(); i++)
        {
         if(str.charAt(i)>= '0' && str.charAt(i) <= '9')
         {
             list.add(subString(str, i));
             i+=subString(str, i).length()-1;
         }
         else if(str.charAt(i) == '+')
         {
             sum = 0;
             sum = Integer.parseInt(list.get(list.size()-1)) + Integer.parseInt(subString(str, i+1));
             list.set(list.size()-1, Integer.toString(sum));
             i += subString(str, i+1).length();
         }
         //else if (str.charAt(i) == '-')
             //list.add("-");
        }

        int result =0;
        if(str.charAt(0)== '-')
            result -= Integer.parseInt(list.get(0));
        else
            result = Integer.parseInt(list.get(0));
        for(int i = 1; i<list.size(); i++)
        {
            result -= Integer.parseInt(list.get(i));
        }
        System.out.println(result);
        br.close();
    }
}
