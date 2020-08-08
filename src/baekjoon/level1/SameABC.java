package baekjoon.level1;
import java.util.Scanner;

public class SameABC {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if(2 <= a && b <= 10000 && c<= 10000) {
            System.out.println((a+b)%c);
            System.out.println(((a%c) + (b%c))%c);
            System.out.println((a*b)%c);
            System.out.println(((a%c) * (b%c))%c);
        }
    }
}
