package test;

import java.util.Arrays;

public class Carrot2 {



    public static int[][] solution (int n, int[][] mine){
        int[][] answer = new int[n][n];

        int[] moveX = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] moveY = {0, 0, -1, 1, -1, 1, -1, 1};
        for(int i = 0; i<mine.length; i++)
        {
            int x = mine[i][0] - 1;
            int y = mine[i][1] - 1;

            answer[x][y] = -1;

            for(int j=0; j<8; j++) // 상하 좌우 대각선 총 8개
            {
                int setX = x + moveX[j];
            }
        }


        return answer;
    }

    public static void main(String[] args) {

    }
}
