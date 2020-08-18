package programmers.level1;
/*
문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
각 단어의 짝수번째 알파벳은 대문자로,
홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 */
public class 이상한문자만들기 {
    public static String solution(String s) {

        String answer = "";
        char[] arr = s.toCharArray();
        int j = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == ' ') {
                j = 0;
            }
            else if (j%2 ==0 &&('a' <= arr[i] && arr[i] <= 'z')) {
                arr[i] -= 32;
                j++;
            }
            else if(j%2 ==1 &&('A' <= arr[i] && arr[i] <= 'Z')) {
                arr[i] += 32;
                j++;
            }
            else
                j++;

        }
        answer = new String(arr);


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("   aaa  bbb cc  "));
    }
}
