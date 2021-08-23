package baekjoon.greedy;

import java.io.*;

public class 전자레인지_10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        if (t % 10 != 0) {
            bw.write("-1");
            bw.close();
            return;
        }
        int[] result = new int[3];
        while (t != 0)
        {
            if (t >=300)  {
                t -= 300;
                result[0]++;
            }
            else if (t >= 60) {
                t -= 60;
                result[1]++;
            }
            else {
                t -= 10;
                result[2]++;
            }
        }
        bw.write(result[0] + " "+ result[1] + " " + result[2]);
        bw.close();
    }
}
