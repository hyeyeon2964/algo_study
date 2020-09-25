package programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class 정수내림차순으로배치하기 {
    public long solution(long n) {

        String num = String.valueOf(n);
        char[] arr = num.toCharArray();
        Arrays.sort(arr);

        String result = "";
        for(int i = arr.length-1; i>=0; i--){
            result +=arr[i];
        }

        return Long.parseLong(result);
    }
}
