package baekjoon.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 나무자르기 {
    static int[] trees;

    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        trees = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i<n; i++){
            trees[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(trees);
        long end = trees[trees.length - 1];
        long start = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            long sum = 0;
            for (int tree : trees) {
                if (tree > mid) {
                    sum += tree - mid;
                }
            }
            if (sum >= m) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }

        }
        System.out.println(end);
    }
}
