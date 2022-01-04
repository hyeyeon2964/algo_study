package programmers.level1;

import java.util.Arrays;

public class 비밀지도 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuffer[] str = new StringBuffer[n];
        int binary;
        for(int i = 0; i<n; i++){
            binary = (arr1[i] | arr2[i]); // 비트 연산으로 or계산
            int index = 0;
            str[i] = new StringBuffer(); //초기화 안해주면 nullpointer 에러 발생

            while(index < n){ //str에 결과 값의 반대로 집어넣음
                if(binary % 2 == 1)
                    str[i].append('#');
                else
                    str[i].append(' ');
                index++;
                binary /= 2;
            }

        }
        for(int i = 0; i<n; i++){
            answer[i] = str[i].reverse().toString(); //반대로 만들어 answer에 넣음
        }
        return answer;
    }
    public static String[] solution1(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();
        int binary;
        for (int i = 0; i<n; i++) {
            binary = (arr1[i] | arr2[i]);
            sb = new StringBuilder();
            while(sb.length() != n) {
                if (binary == 0) { // 만약 0 | 1 이였을때 자리값을 공백으로 채워야 해서 필요한 if문
                    sb.append(" ");
                }
                else if (binary%2 == 1) {
                    sb.append("#");
                }
                else {
                    sb.append(" ");
                }
                binary = binary/2;
            }
            answer[i] = sb.reverse().toString();
        }


        return answer;
    }


    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};


        String[] arr = solution1(n, arr1, arr2);
        for(String s : arr){
            System.out.println(s);
        }

    }
}
