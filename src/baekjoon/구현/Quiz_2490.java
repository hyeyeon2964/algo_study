package baekjoon.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//도는 A, 개는 B, 걸은 C, 윷은 D, 모는 E

public class Quiz_2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        char[] 윷 = {'D', 'C', 'B', 'A', 'E'};
        char[] result = new char[3];
        int num = 0;
        for (int i = 0; i<3; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<4; j++) {
                num += Integer.parseInt(st.nextToken());
            }
            result[i] = 윷[num];
            num = 0;
        }
        for(char c:result) {
            System.out.println(c);
        }

    }
}
