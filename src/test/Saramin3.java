package test;
import java.util.*;
import java.io.*;

public class Saramin3 {
    public static Scanner scanner = new Scanner(System.in);

    public static void testCase(int caseNum) {
        int len = scanner.nextInt();
        String[] input = new String[len];
        for(int i = 0; i<len; i++)
        {
            input[i] = scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        int tn = scanner.nextInt();
        for(int caseNum = 1; caseNum <= tn; caseNum++){
            testCase(caseNum);
        }
    }

}
