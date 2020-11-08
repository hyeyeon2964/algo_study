package test;

public class 우테코2020_4 {
        public int solution(int n, int[][] board) {
            int answer = n * n;
            int now = 1;
            int[] nowLocation = new int[]{0, 0};
            while (now <= n * n) {
                int[] findLocation = getLocation(now, board);
                answer += getMoveCount(nowLocation, findLocation, n);
                now++;
                nowLocation = findLocation;
            }
            return answer;
        }

        public int getMoveCount(int[] now, int[] find, int n) {
            int x1 = Math.abs(now[0] - find[0]);
            int x2 = Math.min(now[0] + n - find[0], n - now[0] + find[0]);
            int y1 = Math.abs(now[1] - find[1]);
            int y2 = Math.min(now[1] + n - find[1], n - now[1] + find[1]);

            return Math.min(x1, x2) + Math.min(y1, y2);
        }

        public int[] getLocation(int find, int[][] board) {
            for (int i = 0; i < board.length; ++i) {
                for (int j = 0; j < board.length; ++j) {
                    if (board[i][j] == find)
                        return new int[]{j, i};
                }
            }
            return new int[]{0, 0};
        }
    }
