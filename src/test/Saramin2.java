package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Saramin2 {

    public static void main(String[] args) throws Exception {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[length];
        int i = 0;
        int result = 0;

        arr[0] = 1983;
        result = 1983;
        i++;
        while (i != length) {
            arr[i] = arr[i - 1] * (a + b) % 20090711;
            //Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            result += arr[i / 2] % 20090711;
            i++;
        }
        System.out.println(result);
    }
}
