package programmers.level2;

import java.util.Arrays;

public class Kakao3 {
    public static int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        int count = 0;

        for(int i=0; i<query.length; i++){
            query[i] = query[i].replaceAll(" and ", " ");
            String[] queryArr = query[i].split(" ");

            answer[i] = 0;
            for(int j = 0; j<info.length; j++){
                String[] infoArr = info[j].split(" ");
                count = 0;
                for(int k=0; k<5; k++){
                    if(k == 4){
                        int queryScore = Integer.parseInt(queryArr[4]);
                        int infoScore = Integer.parseInt(infoArr[4]);
                        if(queryScore <= infoScore){
                            count++;
                        }
                    }
                    if(queryArr[k].equals("-")){
                        count++;
                        continue;
                    }
                    else {
                        if (queryArr[k].equals(infoArr[k]))
                        count++;
                        else
                            break;
                    }
                }
                if(count == 5){
                    answer[i]++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
        String[] query ={"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
        System.out.println(Arrays.toString(solution(info, query)));
    }
}
