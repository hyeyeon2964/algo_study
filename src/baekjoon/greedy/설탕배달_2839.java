package baekjoon.greedy;

import java.io.*;

public class 설탕배달_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sugar = Integer.parseInt(br.readLine());
        int result = 0;

        if (sugar % 5 == 0)
            result = sugar / 5;
        else {
            while (sugar > 0) {
                sugar -= 3;
                result ++;

                if (sugar % 5 == 0) {
                    result += sugar / 5;
                    sugar = sugar % 5;
                }
            }
        }
        if (sugar < 0)
            result = -1;
        System.out.println(result);
    }
}
