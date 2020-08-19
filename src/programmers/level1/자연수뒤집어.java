package programmers.level1;

public class 자연수뒤집어 {
    public int[] solution(long n) {
        long copy = n;
        int index =0;

        while(copy > 0){
            index++;
            copy /= 10;
        }

        int[] answer = new int[index];

        for(int i=0; i<index; i++){
            answer[i] = (int)(n % 10);
            n /=10;
        }

        return answer;
    }
}
