package test_2021;

public class Kakao6 {
    int[][] temp;
    public int solution(int[][] board, int[][] skill) {
        int answer = 0;
        int type;
        int degree;
        int r1;
        int c1;
        int r2;
        int c2;
        for(int i = 0; i<skill.length; i++) {
            type = skill[i][0];
            r1 = skill[i][1];
            c1 = skill[i][2];
            r2 = skill[i][3];
            c2 = skill[i][4];
            degree = skill[i][5];

            for (int j = 0; j<=r2-r1; j++){
                for (int k = 0; k<=c2-c1; k++) {
                    if (type == 1) {
                        board[r1+j][c1+k] -= degree;
                    }
                    else {
                        board[r1+j][c1+k] += degree;
                    }
                }
            }

        }

        for (int i = 0; i<board.length; i++) {
            for (int j = 0; j<board[i].length; j++) {
                if (board[i][j] > 0)
                    answer++;
            }
        }
        return answer;
    }

}
