package baekjoon.sort;

import java.io.*;
import java.util.Arrays;

public class 좌표정렬_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        for(int i = 0; i<n; i++) {
            String[] s = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }
        Arrays.sort(arr, ((o1, o2) -> {
            if(o1[0] == o2[0]){
                return Integer.compare(o1[1], o2[1]);
            }
            else {
                return Integer.compare(o1[0], o2[0]);
            }
        }));
        for(int i = 0; i<n; i++) {
            System.out.println(arr[i][0]+ " " + arr[i][1]);
        }
    }

}
