package baekjoon.level3;
//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
import java.util.Scanner;
public class 합 {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int result = 0;
        if (1 <= n && n <= 10000) {
            for(int i = 1; i <= n; i++)
                result +=i;
        }
        System.out.println(result);
    }
}
