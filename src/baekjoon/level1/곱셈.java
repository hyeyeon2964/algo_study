package baekjoon.level1;
import java.util.Scanner;

public class 곱셈 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int x = 0;
        int result = a* b;


            for(int j = 0; j < 3; j++){
                x = b % 10;
                b /= 10;
                System.out.println(x * a);
            }

        System.out.println(result);
    }

}
