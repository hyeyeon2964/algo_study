package programmers.level1;

import java.util.Arrays;
public class K번째수 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];


        for(int i = 0; i <commands.length; i++){
            int len = commands[i][1] - commands[i][0] + 1; //새로운 배열의 길이
            int[] arr = new int[len];
            int index = commands[i][0] -1 ; //값을 가져올 array 인덱스
            for(int j = 0; j<arr.length; j++){
                arr[j] = array[index++];
            }

            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            answer[i] = arr[commands[i][2]-1];
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
        solution(array, commands);
    }
}
