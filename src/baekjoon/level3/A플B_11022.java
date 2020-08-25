package baekjoon.level3;
import java.io.*;
import java.util.StringTokenizer;

public class A플B_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int index = 1;
        for(int i = 0; i< n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            result = a+b;
            bw.write("Case #"+ index + ": " + a+ " + "+ b + " = " + result + "\n");
            index++;
        }
        bw.flush();
        bw.close();

    }
}
