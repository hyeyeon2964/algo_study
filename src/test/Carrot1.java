package test;

import java.util.ArrayList;
import java.util.Arrays;

public class Carrot1 {

    public static String solution(String number) {
        String answer = "";
        ArrayList<String> num = new ArrayList<>();
        num.add("zero");
        num.add("one");
        num.add("two");
        num.add("three");
        num.add("four");
        num.add("five");
        num.add("six");
        num.add("seven");
        num.add("eight");
        num.add("nine");

        String word ="";
        for(int i = 0; i<number.length(); i++)
        {
            word +=number.charAt(i);
            if(num.contains(word))
            {
                answer += String.valueOf(num.indexOf(word));
                word = "";
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution("onesevenfive"));
        System.out.println(solution("threetwo"));

    }
}
