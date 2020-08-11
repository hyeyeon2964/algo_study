package baekjoon.level2;
import java.util.Scanner;
public class 알람시계 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hour = scan.nextInt();
        int min = scan.nextInt();

        if((0 <= hour && hour <= 23) && (0 <= min && min <= 59)) {
            if (min < 45) {
                if (hour == 0)
                    hour = 23;
                else
                    hour -= 1;
                min = min + 60 -45;
            }
            else
                min -= 45;
        }

        System.out.println(hour + " " + min);

    }
}
