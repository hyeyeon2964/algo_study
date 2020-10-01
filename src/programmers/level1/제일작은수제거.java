package programmers.level1;

import java.util.*;

/*
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 */
public class 제일작은수제거 {
    public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length == 1){ //길이가 1일때 -1 리턴
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr)
                list.add(i); //ArrayList에 arr담기
        Arrays.sort(arr);
        list.remove((Integer)arr[0]); //제일 작은수 list에서 제거

        answer = new int[list.size()];
        int size =0;
        for(int i : list){
            answer[size++] = i;
        }
        return answer;
    }
}
