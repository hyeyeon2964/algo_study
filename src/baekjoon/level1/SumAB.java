package baekjoon.level1;
import java.util.Scanner;

public class SumAB {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();

        if(0 < a && b <10) {
            System.out.println(a+b);
        }
    }
}
