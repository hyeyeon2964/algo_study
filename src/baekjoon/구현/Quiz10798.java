package baekjoon.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Quiz10798 {
    private static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int max = 0;
        sb = new StringBuilder();

        for(int i = 0; i<5; i++) { //입력 코드
            String s = br.readLine();
             list.add(s);
             max = Math.max(max, s.length()); //가장 긴 문자열 길이 저장
        }

        for(int i = 0; i<max; i++) { //가장 긴 문자열 길이 만큼 반복
            for(int j = 0; j<5; j++) { // 문자열 5개 순회 반복
                int length = list.get(j).length();
                if (i < length) { // 만약 세로 인덱스 i가 현재 문자열의 길이보다 작다면 append
                    sb.append(list.get(j).charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
}
