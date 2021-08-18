package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 회의실배정_1931 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for(int i = 0; i<n; i++) {
            String[] s = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }
        Arrays.sort(arr, ((o1, o2) -> {
            if(o1[1] == o2[1]){
                return Integer.compare(o1[0], o2[0]);
            }
            else {
                return Integer.compare(o1[0], o2[0]);
            }
        }));
        System.out.println(Arrays.toString(arr));
        int start_time;
        int end_time;
        for(int i = 0; i<n-1; i++) {
            end_time = arr[i][1];
            for(int j = i + 1; j < n; j++) {
                start_time = arr[j][0];
                if (end_time < start_time) {
                    result++;
                    i = j - 2;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
