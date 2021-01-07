package programmers.level2;

import javax.swing.text.StyledEditorKit;
import java.util.Map;

public class 소수만들기 {
    public static int solution(int[] nums) {
        int answer = 0;
        boolean isPrime = true;
        for(int i = 0; i< nums.length; i++)
        {
            for(int j = 0; j< nums.length; j++)
            {
                if (i == j)
                {
                    continue;
                }
                for(int k = 0; k<nums.length; k++)
                {
                    if(k == j || k == i)
                    {
                        continue;
                    }
                    int num = nums[i] + nums[j] + nums[k];
                    int sqrt = (int)Math.sqrt(num);
                    isPrime = true;
                    for(int l = 2; l<=sqrt; l++)
                    {
                        if(num % l == 0)
                        {
                            isPrime = false;
                            break;
                        }
                    }
                    if(isPrime == true)
                    {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {11,2,3,4};
        System.out.println(solution(arr));
    }
}
