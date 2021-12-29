package programmers.level1;

import java.util.ArrayList;

public class 로또의최고순위와최저순위 {
    private static int countZero;
    private static int correct;
    public void count_zero(int[] lottos) {
        for(int n : lottos) {
            if (n == 0) {
                countZero++;
            }
        }
    }
    public void getCorrect(int[] lottos, int[] win_nums) {
        correct = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : win_nums) {
            list.add(num);
        }

        for(int n : lottos) {
            if(list.contains(n)) {
                correct++;
            }
        }

    }
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        countZero = 0;
        correct = 0;
        int[] win = {6,6,5,4,3,2,1}; //배열에 로또 순위를 저장
        ArrayList<Integer> winNum = new ArrayList<>();
        count_zero(lottos);
        getCorrect(lottos, win_nums);

        answer[0] = win[correct];
        answer[1] = win[correct + countZero];


        return answer;
    }
    public static void main(String[] args) {

    }
}
