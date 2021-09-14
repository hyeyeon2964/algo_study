package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단오르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int max = 0;
        int[] stairs = new int[num];
        for (int i = 0; i<num; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        max = Math.max(dfs(0, stairs), dfs(1, stairs));
        System.out.println(max);
    }
    /*
    한 계단 or 두 계단 씩 오를 수 있다
    연속된 세 개의 계단을 밝아서는 안된다.
    마지막 도착 계단은 무조건 밟아야 함
     */
    public static int dfs(int index, int[] arr) {
        int result = 0;
        int visit = 0;

        result += arr[index];
        for (int i = index; i<arr.length; i++) {
            if (i == arr.length - 1)
                break;
                if (visit <3 && (i == arr.length - 2 || (arr[i + 1] > arr[i + 2]))) {
                    result += arr[i + 1];
                    visit++;
                }

            else {
                result += arr[i+2];
                i++;
                visit = 0;
                }
            }
        return result;
        }
    }
