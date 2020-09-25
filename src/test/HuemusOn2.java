package test;

public class HuemusOn2 {
    public static int solution(int []A, int S){
        int answer = 0;
        int sum = 0;

        for(int i = 0; i<A.length; i++){
            sum = A[i];
            if(sum == S){ 
                answer++;
                continue;
            }
            else if(sum > S) //현재 인덱스가 S보다 클 때 담 인덱스로 넘김
                continue;
            
            for(int j = i+1; j<A.length; j++){
                sum += A[j];
                if(sum > S)
                    break;
                if(sum == S){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int[] A = {1,1,1,3};
        int S = 3;
        System.out.println(solution(A, S));
    }
}
