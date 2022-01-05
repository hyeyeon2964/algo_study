package baekjoon.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz_3048 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N1 = Integer.parseInt(st.nextToken());
        int N2 = Integer.parseInt(st.nextToken());
        String ant1 = br.readLine();
        String ant2 = br.readLine();
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb1 = new StringBuilder();
        StringBuilder result = new StringBuilder();
        sb1.append(ant1);
        ant1 = sb1.reverse().toString();
        result.append(ant1);
        result.append(ant2);


        int[] arr = new int[result.length()];
        for (int i = 0; i<arr.length; i++) { //그룹 비교를 위한 배열 생성 앞에 그룹은 0 뒤에 그룹은 1
            if (i<ant1.length()) {
                arr[i] = 0;
            }
            else
                arr[i] = 1;
        }
        for (int i = 0; i<T; i++) {
            for (int j = 0; j<result.length()-1; j++) {
                if(arr[j] == 0 && arr[j+1] == 1) { // 만약 서로 다른 방향의 개미가 만난다면
                    arr[j] = 1;
                    arr[j+1] = 0; // 두 개미의 위치를 바꿈
                    char a = result.charAt(j);
                    char b = result.charAt(j+1);
                    result.setCharAt(j, b);
                    result.setCharAt(j+1, a); // 문자열 치환
                    j++;
                }
            }
        }

        System.out.println(result.toString());

    }
}
