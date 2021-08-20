package baekjoon.sort;

import java.io.*;

public class 중복빼고정렬하기_10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] arr = new int[2001];
        int num;
        for(int i = 0; i < n; i++){
            num = Integer.parseInt(s[i]) + 1000;
            if(arr[num] != 1)
                arr[num] = 1;
        }
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == 1)
                System.out.print(i - 1000+ " ");
        }
        if(arr[arr.length - 1] == 1) {
            System.out.print(arr.length - 1);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

