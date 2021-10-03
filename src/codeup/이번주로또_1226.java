package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 이번주로또_1226 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer mySt = new StringTokenizer(br.readLine());
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> myNumList = new ArrayList<>();
        int bonus = 0;
        int cnt = 0;
        for (int i = 0; i<6; i++) {
            numList.add(Integer.parseInt(st.nextToken()));
            myNumList.add(Integer.parseInt(mySt.nextToken()));
        }
        bonus = Integer.parseInt(st.nextToken());

        for (int i = 0; i<6; i++) {
            if (myNumList.contains(numList.get(i)))
                cnt++;
        }

        switch (cnt) {
            case 6 : System.out.println(1);
                    break;
            case 5:
                if (cnt == 5 && myNumList.contains(bonus))
                    System.out.println(2);
                else
                    System.out.println(3);
                break;
            case 4 : System.out.println(4);
                    break;
            case 3: System.out.println(5);
                    break;
            default: System.out.println(0);

        }
    }
}
