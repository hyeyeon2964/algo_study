package test_2021;

import java.util.Arrays;
import java.util.Stack;

public class _11st2 {
    public static int solution(int N) {
        // write your code in Java SE 11
        String str =  String.valueOf(N);
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        int answer = 0;
        for(int i = arr.length -1 ; i>0; i--) {
            answer += arr[i] - '0';
            answer *= 10;

            if (answer >100000000) {
                return -1;
            }
        }
        answer += arr[0] - '0';
        if (answer >100000000) {
            return -1;
        }
        return answer;
    }


    public static void main(String[] args) {
        //System.out.println(solution(2147483647));
        System.out.println(solution(101100000));
    }
}
