package programmers.level1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {

        Arrays.sort(arr);
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i =0; i<arr.length; i++){

            if(arr[i] % divisor == 0){
                arrList.add(arr[i]);
            }
        }
        if(arrList.size() == 0)
            arrList.add(-1);

        return arrList.stream().mapToInt(i -> i).toArray();
    }
}
