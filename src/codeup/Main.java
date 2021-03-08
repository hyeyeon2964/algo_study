package codeup;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);
        char q = 'q';
        while(q != c)
        {
            System.out.println(c);
           c=br.readLine().charAt(0);
        }
        System.out.println(c);
        br.close();
    }
}
