package test_2021;

public class Kakao4_2 {
    static boolean[][] check;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int type;
    static int rowStart;
    static int rowEnd;
    static int colStart;
    static int colEnd;
    static int degree;

    public static int solution(int[][] board, int[][] skill) {
        int answer = 0;
        for (int i = 0; i < skill.length; i++) {
            type = skill[i][0];
            rowStart = skill[i][1];
            rowEnd = skill[i][3];
            colStart = skill[i][2];
            colEnd = skill[i][4];
            degree = skill[i][5];
            check = new boolean[board.length][board[0].length];
            if (type == 1)
                board[rowStart][colStart] -= degree;
            else if (type == 2)
                board[rowStart][colStart] += degree;
            dfs(rowStart, colStart, board);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] >= 1)
                    answer++;
            }
        }

        return answer;
    }

    public static void dfs(int x, int y, int[][] board) {
        check[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dr[i];
            int ny = y + dc[i];

            if (nx >= colStart && ny >= rowStart && nx <= colEnd && ny <= rowEnd) {
                if (!check[nx][ny]) {
                    if (type == 1) {
                        board[nx][ny] -= degree;
                        dfs(nx, ny, board);
                    }
                    else if (type == 2) {
                        board[nx][ny] += degree;
                        dfs(nx, ny, board);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] board = {
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5}
        };

        int[][] skill = {
                {1, 0, 0, 3, 4, 4},
                {1, 2, 0, 2, 3, 2},
                {2, 1, 0, 3, 1, 2},
                {1, 0, 1, 3, 3, 1}
        };

        System.out.println(solution(board, skill));
    }
}