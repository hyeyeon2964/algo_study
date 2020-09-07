package programmers.level2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class 프린터 {
    public class Print{
        int key;
        int value;
        public Print(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<HashMap> q = new LinkedList<>();
        char alpha = 'a';

        for(int i : priorities){
            HashMap map = new HashMap();
            map.put(alpha++, i);
            q.offer(map);
        }



        return answer;
    }
}
