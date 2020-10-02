package programmers.level1;

public class 비밀지도 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuffer[] str = new StringBuffer[n];
        int binary;
        for(int i = 0; i<n; i++){
            binary = (arr1[i] | arr2[i]); // 비트 연산으로 or계산
            int index = 0;
            str[i] = new StringBuffer(); //초기화 안해주면 nullpointer 에러 발생

            while(index < n){ //str에 결과 값의 반대로 집어넣음
                if(binary % 2 == 1)
                    str[i].append('#');
                else
                    str[i].append(' ');
                index++;
                binary /= 2;
            }

        }
        for(int i = 0; i<n; i++){
            answer[i] = str[i].reverse().toString(); //반대로 만들어 answer에 넣음
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[] arr = solution(n, arr1, arr2);
        for(String s : arr){
            System.out.println(s);
        }
    }
}
