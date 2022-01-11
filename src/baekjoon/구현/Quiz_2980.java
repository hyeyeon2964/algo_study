package baekjoon.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Quiz_2980 {
    public static class TrafficLight {
        int R;
        int G;

        public TrafficLight(int r, int g) {
            this.R = r;
            this.G = g;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        TrafficLight[] load = new TrafficLight[L + 1];
        int result = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int D = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());
            load[D] = new TrafficLight(R, G);
        }

        int time = 0;
        int pos = 0;
        while (pos < L) {
            ++time; //시간 초 증가
            ++pos; // 다음 위치로 이동

            //신호등이 있으면
            if (load[pos] != null) {
                int check = time % (load[pos].R + load[pos].G);

                if (check <= load[pos].R) {
                    time += (load[pos].R - check);
                }
            }
        }

        System.out.println(time);
    }
}
