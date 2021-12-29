package minsub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 로또의최고순위와최저순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] 당첨 = {6, 6, 5, 4, 3, 2, 1};

        int[] answer = new int[2];

        List<Integer> list = new ArrayList(Arrays.asList(win_nums));

        int max = 0;
        int min = 0;

        int 지워짐 = 0;


        for (int lotto : lottos) {

            if (lotto == 0) {
                지워짐++;
                continue;
            } else if (list.contains(lotto)) {
                min++;
            }
//            for (int win_num : win_nums) {
//                if (lotto == win_num) {
//                    min++;
//                    break;
//                }
//            }

        }
        System.out.println("지워짐 : " + 지워짐);

        max = min + 지워짐;
        answer[0] = 당첨[max];
        answer[1] = 당첨[min];

        return answer;
    }
}
