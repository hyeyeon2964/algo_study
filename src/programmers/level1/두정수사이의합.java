package programmers.level1;

/*두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
 */

public class 두정수사이의합 {

    public static long solution(int a, int b) {
        long answer = 0;
        if(a>b) {
            int idx = a;
            a = b;
            b = idx;
        }

        while(a<=b) {
            answer += (long)a;
            a++;
        }

        return answer;
    }
    public static void main(String args[]){
        System.out.println(solution(3, 5));
    }
}
