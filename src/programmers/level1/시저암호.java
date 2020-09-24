package programmers.level1;

public class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] >= 'a' && arr[i] <='z'){
                arr[i] = (char)  (arr[i] + (n-1) + 'a' - arr[i]);
            }
            if(arr[i] >= 'A' && arr[i] <='Z'){
                arr[i] = (char)  (arr[i] + (n-1) + 'A' - arr[i]);
            }
            answer += arr[i];
        }

        return answer;
    }
}
