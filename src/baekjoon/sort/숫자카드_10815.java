package baekjoon.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class 숫자카드_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(br.readLine());
        String[] s1 = br.readLine().split(" ");
        int N = Integer.parseInt(br.readLine());
        String[] s2 = br.readLine().split(" ");
        ArrayList<Integer> list_m = new ArrayList<>();
        ArrayList<Integer> list_n = new ArrayList<>();
        int[] result = new int[N];
        for (int i = 0; i<M; i++) {
            list_m.add(Integer.parseInt(s1[i]));
        }
        for(int i = 0; i<N; i++) {
            list_n.add(Integer.parseInt(s2[i]));
        }
        result = check_arr(list_m, list_n);

        for(int n : result) {
            bw.write(n + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    public static int[] check_arr(ArrayList M, ArrayList N)
    {
        int[] result = new int[N.size()];

        for(int i = 0; i<M.size(); i++) {
            if (N.contains(M.get(i)))
                result[N.indexOf(M.get(i))] = 1;
        }
        return result;
    }
}
