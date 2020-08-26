package programmers.level1;

public class 정수제곱근판별 {
    public long solution(long n) {

        //double sqrt = Math.sqrt(num);

        if (n == 1)
            return 4;
        for(long i = 2; i*i <=n/2+1; i++){
            if(i*i ==n)
                return (i+1) *(i+1);
        }
        return -1;
    }
}
