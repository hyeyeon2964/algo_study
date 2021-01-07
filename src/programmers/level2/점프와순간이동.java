package programmers.level2;

public class 점프와순간이동 {
    public int solution(int n) {
        int ans = 1;
        int location = 1;

        while(n != 0)
        {
            if(n % 2 == 0) {
                n /= 2;
            }
            else {
                n--;
                ans++;
            }

        }

        return ans;
    }
}
