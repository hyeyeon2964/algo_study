package programmers.level1;

public class 다트게임 {


    public double score_calculation(char ch, int score) {

        switch (ch) {
            case 'S': {
                break;
            }
            case 'D': {
                score = (int)Math.pow(score, 2);
                break;
            }
            case 'T': {
                score = (int)Math.pow(score, 3);
                break;
            }
        }


        return score;
    }

    public int solution(String dartResult) {
        int answerIndex = 0;
        int[] answer = new int[3];
        char[] dartScore = dartResult.toCharArray();

        for(int i = 0; i<dartScore.length; i++){
            if(dartScore[i] >= '0' && dartScore[i] <= '9'){
                if(dartScore[i] =='1' && dartScore[i+1]== '0'){
                    answer[answerIndex] = 10;
                    i++;
                }
                else{
                    answer[answerIndex] =dartScore[i] - '0';
                }
                continue;
            }
            if(dartScore[i] >= 'D' && dartScore[i] <= 'T'){
                answer[answerIndex] = (int) score_calculation(dartScore[i], answer[answerIndex]);
                answerIndex++;
            }
            if(dartScore[i] == '*'){
                if(answerIndex >= 2)
                    answer[answerIndex-2] *=2;
                answer[answerIndex-1] *=2;
            }
            if (dartScore[i] == '#'){
                answer[answerIndex-1] *= -1;
            }
        }
        return answer[0] + answer[1] + answer[2];
    }
}
