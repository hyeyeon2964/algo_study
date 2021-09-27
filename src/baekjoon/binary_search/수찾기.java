package baekjoon.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수찾기 {
    public static int[] A;
    public static int[] B;

    public static int binarySearch(int key, int low, int high) {
        int mid;
        if (low <= high) {
            mid = (low + high) / 2;
            if (key == A[mid]) {
                return 1;
            }
            else if (key < A[mid]) {
                return binarySearch(key, low, mid - 1);
            }
            else {
                return binarySearch(key, mid + 1, high);
            }
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        A = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i<n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        B = new int[m];
        for(int i = 0; i<m; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i<m; i++) {
            System.out.println(binarySearch(B[i], 0, n-1));
        }
    }
}
