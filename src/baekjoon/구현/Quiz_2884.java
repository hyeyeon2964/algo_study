package baekjoon.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz_2884 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        if (min < 45) {
            hour = (hour == 0) ? 23 : hour - 1;
        }
        min = min < 45 ? (min + 60 - 45) : (min - 45);
        System.out.println(hour + " " + min);

    }
}
