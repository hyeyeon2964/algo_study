package baekjoon.level1;

import java.util.Scanner;

public class 사칙연산 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();

        if(1 <= a && b <= 10000) {
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a / b);
            System.out.println(a % b);
        }
    }
}