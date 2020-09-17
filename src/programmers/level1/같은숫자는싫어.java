package programmers.level1;
import java.util.*;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        list.add(arr[0]);
        for(int i = 1; i<arr.length; i++){

            if(!(arr[i] == arr[i-1])){
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}