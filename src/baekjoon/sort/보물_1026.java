package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 보물_1026 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        int[] B = new int[n];
        int result = 0;
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        for(int i = 0; i<n; i++) {
            A[i] = Integer.parseInt(a[i]);
            B[i] = Integer.parseInt(b[i]);
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int index = n - 1;
        for(int i = 0; i<n; i++){
            result += A[i] * B[index--];
        }
        System.out.println(result);
    }
}
