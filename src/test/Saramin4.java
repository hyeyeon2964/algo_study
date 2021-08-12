package test;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;

public class Saramin4 {
    public static final Scanner scanner = new Scanner(System.in);

    static void solution(String text) {

        List<String> textlist = new ArrayList<>(); //추출문자 전체 리스트 저장
        Map<String, Integer> map = new LinkedHashMap<>();

        //대괄호 안 문자 추출
        String regex = "\\[(.*?)\\]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        while (m.find()) {
            String tempText = m.group(1);
            if (tempText.contains(",")) {
                String[] temp = tempText.split(",");
                for (String str : temp) {
                    textlist.add(str.trim());
                }
            } else {
                textlist.add(tempText.trim());
            }
        }

        int textIndex = 1;
        for (String tempText : textlist) {
            if (map.get(tempText) == null) {
                map.put(tempText, textIndex);
                textIndex++;
            }
        }

        // 텍스트 대치
        String answer = text;
        for (String changeText : map.keySet()) {
            answer = answer.replaceAll(changeText, String.valueOf(map.get(changeText)));
        }

        //숫자 정렬위해 대괄호 추출
        List<String> sortForNumText = new ArrayList<>();
        p = Pattern.compile(regex);
        m = p.matcher(answer);
        while (m.find()) {
            sortForNumText.add(m.group(1).trim());
        }

        // 숫자로 변환된 참고문헌 정렬해서 answer에 반영
        for (String sortNums : sortForNumText) {
            String[] nums = sortNums.split(", ");
            Arrays.sort(nums);

            String temp = nums[0];
            for (int i = 1; i < nums.length; i++) {
                temp += ", " + nums[i];
            }
            answer = answer.replaceAll(sortNums, temp);
        }

        //대치된 텍스트 출력
        System.out.println(answer);

        //참고문헌 출력
        for (String changeText : map.keySet()) {
            System.out.println("[" + map.get(changeText) + "]" + " " + changeText);
        }
    }
}