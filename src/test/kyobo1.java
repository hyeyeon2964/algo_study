package test;

import java.util.Arrays;
import java.util.Scanner;

public class kyobo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        if (n < 3) { //"N의 값은 3보다 크거나 같다" 주의사항 예외 처리
            System.out.println("N의 값은 3보다 크거나 같아야 합니다.");
            return ;
        }
        int[] result = new int[2];
        result = findStartValue(n, k);
        System.out.println("ANSWER : "+ Arrays.toString(result));
    }

    //a,b는 0을 포함한 자연수라고 가정하고 문제풀이를 진행
    static int[] findStartValue(int n, int k)
    {
        for(int i = 0; i<100; i++) //범위는 임의대로 100으로 정했습니다.
        {
            for(int j = 1; j<100; j++)
            {
                if (fibonacci(i , j, n, k))
                    return new int[]{i, j};
            }
        }
        System.out.println("입력한 정보가 잘못 되었습니다.");
        return new int[]{0,0}; //n과 k가 잘못 들어왔을 때 예외처리
    }
    static boolean fibonacci(int a, int b, int n, int k)
    {
        int value = 0; //수열의 인덱스에 있는 값

        for(int i = 3; i <= n; i++)
        {
            value = a + b;
            a = b;
            b = value;
        }
        if (value == k) //만약 입력받았던 k와 a,b의 초기값으로 피보나치 수열을 만든 value가 같다면 조건 만족
            return true;
        return false;
    }
}