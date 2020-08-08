package baekjoon.level2;
import java.util.Scanner;
public class 시험성적 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if(90 <= num && num <= 100)
            System.out.println("A");
        else if (80 <= num && num <= 89)
            System.out.println("B");
        else if (70 <= num && num <= 79)
            System.out.println("C");
        else if (60 <= num && num <= 69)
            System.out.println("D");
        else if (0 <= num && num <= 59)
            System.out.println("F");
    }
}
