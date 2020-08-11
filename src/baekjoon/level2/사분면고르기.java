package baekjoon.level2;

import java.util.Scanner;
public class 사분면고르기 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        if ((-1000 <= x && x <= 1000 && x !=0 ) && (-1000 <= y && y <= 1000 && y !=0) )
        {
            if ( 0 < x && 0 < y)
                System.out.println("1");
            else if ( 0 < x && 0 > y)
                System.out.println("4");
            else if ( 0 > x && 0 < y)
                System.out.println("2");
            else
                System.out.println("3");
        }
    }
}
