package test_2021;

import java.io.*;
import java.util.*;
import java.lang.*;

class nhn1 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt(); // 송수신 기록의 수
        String[] logs = new String[n+1]; // 송수신 기록
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> len = new ArrayList<>();
        int cnt = 1;

        scanner.nextLine().trim();
        for(int i = 0 ; i < n ; i ++)
        {
            logs[i] = scanner.nextLine().trim();
        }

        for(int i = 0 ; i < n ; i=i+cnt)
        {
            cnt = 1;
                for (int j = i+1; j<n; j++) {
                    if (!logs[i].equals(logs[j])) {
                        break;
                    }
                    cnt++;
                }
                list.add(logs[i]);
                len.add(cnt);
        }

        System.out.println(list.size());
        for (int i = 0; i<list.size(); i++) {
            System.out.print(list.get(i)+ " ");
            if(len.get(i) != 1) {
                System.out.print("(" +len.get(i) + ")" );
            }
            System.out.println();
        }

    }
}
