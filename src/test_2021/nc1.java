package test_2021;

public class nc1 {
    static int max = 0;
    static int xlen;
    static int ylen;
    static int x;
    static int y;
    static public void dfs(int[][] costs,int i, int j, int sum) {
        if ((i == xlen-1)) {
            sum += costs[i][j];
            max = Math.max(max, sum);
            for (int k = j + 1; k<xlen; k++) {
                sum -= x;
                sum += costs[i][k];
                max = Math.max(max, sum);
            }
            return ;
        }
        else {
            if (j == ylen){
                sum += y;
                return ;
            }

            sum += costs[i][j]; //현재 배열 값 sum에 더하기
            sum -= y; //밑으로 이동하는 비용
            dfs(costs, i+1, j, sum);
            sum -= x; //우측으로 이동하는 비용
            dfs(costs, i, j+1, sum);
            //sum += x; //다시 더해서 초기값으로 만들기

        }
    }
    static public int solution(int[][] costs, int xcost, int ycost) {
        int answer = -1;
        xlen = costs.length;
        ylen = costs[0].length;
        x = xcost;
        y = ycost;

        dfs(costs, 0, 0, 0);
        answer = max;
        return answer > 0 ? answer : 0;
    }

    public static void main(String[] args) {
        int[][] cost = {{1,0,0}, {1,0,0}, {1,0,0}};
        System.out.println(solution(cost, 100, 100));
        //System.out.println(solution(cost, 100, 0));
    }

//    private static final int PATHWAY_COLOUR = 0;
//    private static final int WALL_COLOUR = 1;
//    private static final int BLOCKED_COLOUR = 2;
//    private static final int PATH_COLOUR = 3;
//
//    public static boolean findMazePath(int x, int y) {
//        if (x<0 || y<0 || x>=N || y>=N) //미로의 바깥
//            return false;
//        else if (maze[x][y] != PATHWAY_COLOUR)
//            return false;
//        else if (x == N-1 && y == N-1) {
//            maze[x][y] = PATH_COLOUR;
//            return true;
//        }
//    }
}
