package programmers.level1;

public class 하샤드수 {
    public boolean solution(int x) {

        int num= x;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        if(x % sum == 0)
            return true;
        else
            return false;
        }
}
