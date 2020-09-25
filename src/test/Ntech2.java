package test;

public class Ntech2 {
    public int solution(int N) {
        int answer = 0;
        if(N <=2)
            return N;
        else {
            int[] table = new int[N+1];
            table[0] = 0;
            table[1] = 1;
            table[2] = 2;
            for (int i = 3; i <= N; i++) {
                table[i] = table[i - 1] + table[i - 2];
            }
            answer = table[N];
        }
        return answer;
    }
}