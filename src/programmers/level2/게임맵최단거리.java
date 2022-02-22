package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

class Point {
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class 게임맵최단거리 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] dis;
    static int result = 0;

    public static void bfs(int[][] maps, int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        maps[x][y] = 2;
        while(!q.isEmpty()) {
            Point tmp = q.poll();
            for(int i = 0; i<4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx >= 0 && nx < 5 && ny >= 0 && ny < 5 && maps[nx][ny] == 1) {
                    q.offer(new Point(nx, ny));
                    result++;
                }
            }
        }
    }
    public static int solution(int[][] maps) {
        int answer = 0;

        bfs(maps, 0, 0);

        return result;
    }

    public static void main(String[] args) {
        int [][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println(solution(maps));
    }
}
