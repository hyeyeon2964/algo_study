package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;
public class 다리를지나는트럭 {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> truckList = new LinkedList<Integer>();

        int time = 0;
        int tWeight = 0;

        for(int i : truck_weights){
            while(true){
                if(truckList.isEmpty()){
                    truckList.offer(i);
                    tWeight += i;
                    time++;
                    break;
                }
                else if (truckList.size() == bridge_length){
                    tWeight -= truckList.poll();
                }
                else{
                    if(tWeight + i <= weight){
                        truckList.offer(i);
                        tWeight +=i;
                        time++;
                        break;
                    }
                    else {
                        truckList.offer(0);
                        time++;
                    }
                }
            }

        }
        return time + bridge_length;
    }

    public static void main(String[] args) {
        int bridge_len = 2;
        int weight = 10;
        int[] truck = {7, 4, 5, 6 };
        System.out.println(solution(bridge_len, weight, truck));

    }
}
