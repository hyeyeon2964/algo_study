package programmers.level2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class Line1 { //2번
    public static int[] solution(int[] ball, int[] order) {
        int[] answer = new int[order.length];
        Deque<Integer> dq = new ArrayDeque<>();


        for(int i : ball){
            dq.addLast(i);
        }

        ArrayList waitList = new ArrayList();
        int index = 0;
        for(int i=0; i<order.length; i++){
            if(dq.peekFirst() == order[i]){
                answer[index++]= dq.removeFirst();

            }
            else if(dq.peekLast() == order[i]){
                answer[index++] = dq.removeLast();

            }
            else{
                waitList.add(order[i]);
                continue;
            }

            while(true){
                if(waitList.contains(dq.peekFirst())){
                    answer[index++]= dq.removeFirst();

                }
                else if(waitList.contains(dq.peekLast())){
                    answer[index++] = dq.removeLast();
                }
                else{
                    break;
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] ball = {1, 2, 3, 4, 5, 6};
        int[] order={6, 2, 5, 1, 4, 3};
        System.out.println(Arrays.toString(solution(ball, order)));
    }

}
