package test_2022;

public class kabang1 {
    public static int solution(int[][] fees, int usage) {
        int answer = 0;
        int index = 0;
        int use = usage;
        while(use > 0) {
            if(index == fees.length - 1) {
                answer += fees[index][1];
                answer += fees[index][2] * use;
                break;
            }

            if(index == 0) {
                if(use > fees[0][0]) {
                    answer += fees[index][2] * fees[index][0];
                    use -= fees[index][0];
                }
                else {
                    answer += fees[index][2] * use;
                    answer += fees[index][1];
                    use -= fees[index][0];
                }
            }
            else if(fees[index][0]-fees[index-1][0] >= use) {
                answer += fees[index][1];
                answer += fees[index][2] * use;
                use -= fees[index][0];
            }
            else {
                answer += fees[index][2] * (fees[index][0] - fees[index-1][0]);
                use -= (fees[index][0] - fees[index-1][0]);
            }
            index++;
        }


        return answer;
    }

    public static void main(String[] args) {
        int[][] fees = {{1851, 1000, 100}, {0, 2000, 155}};
        System.out.println(solution(fees,1205));

//        int[][] fees1 = {{200, 910, 93}, {400, 1600, 188}, {655, 7300, 281}, {0, 15372, 435}};
        //System.out.println(solution(fees1,450));
;
    }
}
