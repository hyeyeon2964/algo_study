package programmers.level1;

public class 모의고사 {
    public static int[]  solution(int[] answers) {
        int[] answer = new int[0];

        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int p1Result = 0;
        int p2Result= 0;
        int p3Result = 0;

        for(int i = 0; i<answers.length; i++){

            if(answers[i] == p1[i%5])
                p1Result++;
            if(answers[i] == p2[i%8])
                p2Result++;
            if(answers[i] == p3[i%10])
                p3Result++;

        } //점수구하기


        int max = 0;
        //제일 많이 맞은 사람의 점수 구하기
        if (p1Result >= p2Result && p1Result >= p3Result) {
            max = p1Result;
        } else if (p2Result >= p1Result && p2Result >= p3Result) {
            max = p2Result;
        } else {
            max = p3Result;
        }

        //결과 배열 answer에 결과 값 넣기
        if(max == p1Result){

            if(max == p2Result) {

                if (max == p3Result) {
                    answer= new int[3];
                    answer[0] = 1;
                    answer[1] = 2;
                    answer[2] =3;
                }
                else {
                    answer = new int[2];
                    answer[0] = 1;
                    answer[1] = 2;
                }
            }
            else if(max == p3Result){
                answer = new int[2];
                answer[0]=1;
                answer[1]= 3;
            }
            else {
                answer = new int[1];
                answer[0] = 1;
            }
        }
        else if(max == p2Result) {

            if(max== p3Result){
                answer = new int[2];
                answer[0] = 2;
                answer[1] = 3;
            }
            else {
                answer = new int[1];
                answer[0] = 2;
            }
        }
        else if (max == p3Result) {
            answer = new int[1];
            answer[0] = 3;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answer = {1, 3, 2, 4, 2};
        System.out.println();
    }
}
