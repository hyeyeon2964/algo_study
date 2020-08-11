package baekjoon.level3;
import java.util.Scanner;
public class A더하기B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1;
        int n2;
        int n = scan.nextInt();
        int[] result = new int[n];

        for(int i = 0; i < n; i++) {
            n1 = scan.nextInt();
            n2 = scan.nextInt();
            result[i] = n1+n2;

        }
        int index = 0;
        while(index < n)
        {
            System.out.println(result[index]);
            index++;
        }
    }
}
