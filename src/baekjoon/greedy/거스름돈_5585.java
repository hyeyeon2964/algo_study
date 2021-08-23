package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 거스름돈_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cash = 1000 - Integer.parseInt(br.readLine());
        int result = 0;

        while (cash != 0)  {
            if (cash >= 500)
                cash -= 500;
            else if (cash >= 100)
                cash -= 100;
            else if (cash >=50)
                cash -= 50;
            else if (cash >= 10)
                cash -= 10;
            else if (cash >= 5)
                cash -= 5;
            else
                cash -= 1;
            result++;
        }
        System.out.println(result);
    }
}
