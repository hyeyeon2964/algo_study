package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Line3 { //4번


    public int solution(int[][] maze) {
        int answer = 0;

        int x= 0;
        int y=0;
        int course = 0;
        while( !(x == maze.length-1 && y == maze.length-1)){

            switch (course){
                case 0: {
                    if(maze[x][y+1] == 1){
                        x= x+1;
                        answer++;
                        break;
                    }
                    else if(maze[x][y+1] == 0 || maze[x+1][y] == 1){
                        course++;
                        y = y+1;
                        answer++;
                        break;
                    }
                }
                case 1: {
                    if(maze[x-1][y] == 1 || x == 0){
                        y = y+1;
                        answer++;
                        break;
                    }
                    else if(maze[x-1][y] == 0 || y == maze.length-1) {
                        course++;
                        answer++;
                         x = x-1;
                         break;
                    }
                }
                case 2:{
                    if(maze[x][y-1] == 1){
                        x = x-1;
                        answer++;
                        break;
                    }
                    else{
                        y = y-1;
                        course++;
                        answer++;
                        break;
                    }
                }
                case 3: {
                    if(maze[x+1][y]== 1 ){
                        y = y-1;
                        answer++;
                        break;
                    }
                    else
                    {
                        course = 0;
                        x= x+1;
                        answer++;
                        break;

                    }
                }
            }

        }

        return answer;
    }
}
