package test;
import java.io.*;
public class scp2 {
    public static int dfs( int index, String[] arr , int target) {
        int answer = 0;
        if(index == arr.length -1 ) {
            return 1;
        }
        else if (index>=arr.length)
            return 0;
        if(Integer.parseInt(arr[index]) == 0)
            return 0;
        answer += dfs(index + 1, arr, target);
        answer += dfs(index + 2, arr, target);

        return answer;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int end = Integer.parseInt(br.readLine());
        String[] location = br.readLine().split("");
        int answer = dfs(0, location, end);
        System.out.println(answer);
    }
}