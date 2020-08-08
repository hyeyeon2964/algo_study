package baekjoon.level2;
import java.util.Scanner;
public class 두수비교하기 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if((-10000 <= a && a <= 10000) && (-10000 <= b && b <= 10000))
        {
        if (a == b)
            System.out.println("==");
        else if (a>b)
            System.out.println(">");
        else
            System.out.println("<");
    }
    }
}
