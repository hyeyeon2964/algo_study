package programmers.level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 직업군추천하기 {
    public static int getScore(String[] table, Map<String, Integer> map) {
        int result = 0;
        int index = table.length - 1;
        for(int i = 1; i<table.length / 2; i++) {
            String temp = table[index];
            table[index--] = table[i];
            table[i] = temp;
        }

        for (int i = 1; i<table.length; i++) {
            if (map.containsKey(table[i])) { //만약 선호 언어에 있으면 result에 더함
                result += map.get(table[i]) * i;
            }
        }
        return result;
    }
    public static String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i<languages.length; i++) { //언어와 선호도를 map에 넣음
            map.put(languages[i], preference[i]);
        }

        int max = 0;
        for(int i = 0; i<table.length; i++) {

            int num = getScore(table[i].split(" "), map);
            String[] str = table[i].split(" ");

            if(max < num) {
                max = num;
                answer = str[0];
            }
            else if (max == num) {
                if (answer.compareTo(str[0]) > 0) { //answer 보다 str[0]이 사전적 순서가 앞에 있을 때
                    answer = str[0];
                }
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        String[] table = {
                "SI JAVA JAVASCRIPT SQL PYTHON C#",
                "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
                "HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
                "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
                "GAME C++ C# JAVASCRIPT C JAVA"
        };

        String[] languages = {"JAVA", "JAVASCRIPT"};

        int[] preference = {7, 5};

        System.out.println(solution(table, languages, preference));
    }
}
