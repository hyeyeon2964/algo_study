package programmers.level1;

import java.util.Arrays;

public class 비밀지도 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] binaryArr1 = new String[n];
        String[] binaryArr2 = new String[n];
        char[][] charArr1 = new char[n][n];
        char[][] charArr2 = new char[n][n];

        for(int i = 0; i<n; i++){
            binaryArr1[i] = Integer.toBinaryString(arr1[i]); //2진수로 변환
            binaryArr2[i] = Integer.toBinaryString(arr2[i]); //2진수로 변환

            charArr1[i] = binaryArr1[i].toCharArray(); //string 배열 char로 변환
            charArr2[i] = binaryArr2[i].toCharArray();

        }



        for(int i = 0; i<charArr1.length; i++){
            for(int j = 0; j<charArr2[i].length; j++){
                if(charArr1[i][j] == charArr2[i][j]) {
                    if (charArr1[i][j] == '0'){
                        answer[i] += " ";
                    }
                    else{
                        answer[i] += "#";
                    }
                }
                else
                    answer[i] += "#";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        System.out.println(solution(n, arr1, arr2).toString());
    }
}
