package baekjoon.level3;

//자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

import java.io.*;
public class 기찍N {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = n ; i > 0; i--) {
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();

    }

}
