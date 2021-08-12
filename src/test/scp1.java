package test;
import java.io.*;
import java.util.ArrayList;

public class scp1 {
    public static String startTimeCompare(String s1, String s2)
    {
        String[] arr1 = s1.split(":");
        String[] arr2 = s2.split(":");

        if(Integer.parseInt(arr1[0]) == Integer.parseInt(arr2[0])) {
            if(Integer.parseInt(arr1[1]) > Integer.parseInt(arr2[1]))
                return s1;
            else
                return s2;
        }
        else {
            if(Integer.parseInt(arr1[0]) > Integer.parseInt(arr2[0]))
                return s1;
            else
                return s2;
        }

    }
    public static String endTimeCompare(String s1, String s2)
    {
        String[] arr1 = s1.split(":");
        String[] arr2 = s2.split(":");

        if(Integer.parseInt(arr1[0]) == Integer.parseInt(arr2[0])) {
            if(Integer.parseInt(arr1[1]) < Integer.parseInt(arr2[1]))
                return s1;
            else
                return s2;
        }
        else {
            if(Integer.parseInt(arr1[0]) < Integer.parseInt(arr2[0]))
                return s1;
            else
                return s2;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(br.readLine());
        String[] start = br.readLine().split("~");
        String startTime = start[0].trim();
        String endTime = start[1].trim();
        for(int i =1; i<index; i++) {
            String[] arr = br.readLine().split("~");
            startTime = startTimeCompare(startTime, arr[0].trim());
            endTime = endTimeCompare(endTime, arr[1].trim());
        }

        if(startTime.compareTo(endTime) >= 0)
            System.out.println("-1");
        else
            System.out.println(startTime + "~" + endTime);
    }
}

