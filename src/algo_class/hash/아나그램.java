package algo_class.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 아나그램 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();
        if(a.length != b.length) {
            System.out.println("NO");
            return ;
        }
        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();
        for(int i = 0; i<a.length; i++) {
            mapA.put(a[i], mapA.getOrDefault(a[i], 0) + 1);
            mapB.put(a[i], mapB.getOrDefault(b[i], 0) + 1);
        }


    }
}
