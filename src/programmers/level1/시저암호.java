package programmers.level1;

public class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();

        for(int i = 0; i<arr.length; i++){
            if(Character.isLowerCase(arr[i])){
                if(arr[i] + n > 'z')
                    answer += (char)(arr[i] + n - 26);
                else
                    answer += (char)(arr[i] + n);
            }
            else if(Character.isUpperCase(arr[i])){
                if(arr[i] + n > 'Z')
                    answer += (char)(arr[i] + n - 26);
                else
                    answer += (char)(arr[i] + n);
            }
            else
                answer += (char)(arr[i]);

        }

        return answer;
    }
}
