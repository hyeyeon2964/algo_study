package test_2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class nhn2 {

    //표준입력을 수행할 Scanner를 선언한다
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void solution(int N, int M, String[] client){
        Set<String> phoneNum = new HashSet<>();
        int i;
        for (i = 0; i<N; i++) {
            phoneNum.add(client[i]);
            if (phoneNum.size() == M) {
                break;
            }
        }
        System.out.println(i+1);
    }

    public static void testCase(int caseNum) throws IOException
    {   //하나의 테스트케이스를 처리하는 함수
        //각 테스트케이스에 대하여 데이터를 입력받고 정답을 출력하세요
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] client = new String[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++) {
            client[i] = st.nextToken();
        }

        solution(N, M, client);
    }

    public static void main(String[] args) throws IOException
    {   //프로그램의 시작부
        int tn = Integer.parseInt(br.readLine()); //테스트케이스의 수를 입력받는다
        for(int caseNum = 1 ; caseNum <= tn ; caseNum++)
        {   //테스트케이스의 수 만큼 반복 수행한다
            testCase(caseNum);
        }
    }
}