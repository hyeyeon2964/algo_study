package test;

import java.util.Scanner;

public class kyobo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println("ANSWER : " +findShortText(input));
    }

    public static String findShortText(String s) {
        if (s.length() == 1) {
            return s;
        }
        String answer = s;
        //압축가능한 단위의 최대는 길이의 절반이다.
        for (int cutSize = 1; cutSize <= s.length() / 2; cutSize++)
        {
            //압축된 문자 최소 찾기
            String cutString = cut_string(s, cutSize);
            if (answer.length() >= cutString.length()) {
                if (s.equals(cutString)) {
                    continue;
                }
                answer = cutString;
            }
        }
        return answer;
    }

    private static String cut_string(String s, int cutSize)
    {
        String word = s.substring(0, cutSize);; //압축가능한 길이 단위만큼 자른 시작문자열
        int same = 1; //압축한 갯수
        StringBuilder sb = new StringBuilder(); //압축된 문자열을 저장할 객체

        for (int i = cutSize; i <= s.length(); i += cutSize)
        {
            String cmp; //압축가능한 길이 단위만큼 자른 다음 문자열

            if (i + cutSize >= s.length()) { //자르려는 길이가 s의 길이보다 크거나 같을때
                cmp = s.substring(i);
            } else {
                cmp = s.substring(i, i + cutSize); //현재 위치부터 단위만큼 자른다
            }
            if (word.equals(cmp)) { //문자열이 같을때
                same++;
            } else {
                if (same > 1) { //이전에 압축된 문자 처리
                    sb.append(same + word);
                } else {
                    sb.append(word);
                }
                word = cmp;
                same = 1;
            }
        }
        //마지막에 비교된 문자 처리
        if (same != 1) {
            sb.append(same);
        }
        sb.append(word);
        return sb.toString(); //압축된 문자열 길이 반환
    }
}
