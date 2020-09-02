package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;

public class 기능개발 {
    public static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int count = 0;
        int releseCount =0;
        for(int i = 0; i< progresses.length; i++){
            count = 0; //answer에 들어갈 값
            if(progresses[i] >= 100) //100이 넘으면 다음 i값으로 넘어감
                continue;
            while(progresses[i] < 100){ //100이 넘을때까지 계속 진행시켜줌
                for(int j = i; j<progresses.length; j++){
                    progresses[j] += speeds[j];
                }
            }
            for(int x = i; x<progresses.length; x++){
                if(progresses[x] >= 100 ){ //같이 배포 될 프로그램 수 세기
                    count++;
                }
                else
                    break;
            }
            releseCount += count;

            if(releseCount>=progresses.length) { //한번에 다 배포 될 경우
                list.add(count);
                break;
            }
            else
            list.add(count);
        }
        int[] answer = new int[list.size()];
        int index = 0;
        for(int temp : list){
            answer[index++] = temp;
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55, 60, 40, 65};
        int[] speeds = {1, 30, 5 , 10, 60, 7};

        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }
}
