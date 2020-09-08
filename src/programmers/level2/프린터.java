package programmers.level2;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class 프린터 {
    public class Printer{ //프린터 객체에 인덱스, 우선순위 집어넣음
        int priorities;
        int index;

        public Printer(int index,int priorities){
            this.index = index;
            this.priorities = priorities;
        }
    }
    public int solution(int[] priorities, int location) {
        int answer = 1;
        Queue queue = new LinkedList();
        for(int i = 0; i<priorities.length; i++){ //큐에 프린터 객체 넣기
            Printer p = new Printer(i, priorities[i]);
            queue.offer(p);
        }
        while(!queue.isEmpty()){
            Printer p1 = (Printer) queue.poll(); //큐의 제일 앞부분에 있는 프린터 객체 반환
            boolean check = true;
            Iterator it = ((LinkedList) queue).listIterator(); //Iterator로 데이터가 없을때 까지 탐색
            while(it.hasNext()){
                Printer p2 = (Printer) it.next();
                if(p1.priorities < p2.priorities){
                    check = false;
                    break;
                }

            }
            if(check == false){ //뒤에 더 큰 우선순위가 있다면 큐의 맨뒤에 집어 넣음
                queue.add(p1);
            }
            else if (location == p1.index){
                return answer;
            }
            else
                answer++;
        }
        return answer;
    }
}
