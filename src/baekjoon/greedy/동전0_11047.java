package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 동전0_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        //기본 정보를 갖고 있는 변수
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(minimum_coin(k, arr));
    }

    //최솟값 구하는 함수
    public static int minimum_coin(int k, int[] arr) {
        int index = arr.length -1;
        int result = 0;
        while (k != 0) {
            if (k < arr[index]) {
                index--;
            }
            else {
                k -= arr[index];
                result++;
            }
        }
        return result;
    }
}