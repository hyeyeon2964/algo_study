package programmers.level2;


import java.util.Arrays;

public class Hindex {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int h;
        int l;
        while (true){
            h= 0;
            l = 0;
            for(int i = 0; i< citations.length; i++){
                if(answer <= citations[i]){
                    h++;
                }
                else if(answer >= citations[i]){
                    l++;
                }
            }
            if(answer > h || answer <= l)
                return answer;
            else
                answer++;

        }
    }
}