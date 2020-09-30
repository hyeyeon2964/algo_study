package test;

public class _11st2 { //1번

        public static int solution(String S) {
            // write your code in Java SE 8
            int answer = 0;
            int check = 0;

            if(S.contains("aaa"))
                return -1;
            if(S.equals("aa"))
                return 0;

            for(int i = 0; i< S.length(); i++){
                char c = S.charAt(i);

                if(c == 'a'){
                    check++;
                }
                else{
                    answer += 2-check;
                    check = 0;
                }

                if(i == S.length()-1){
                    answer += 2-check;
                }
            }

            return answer;
        }

    public static void main(String[] args) {

        System.out.println(solution("baaa"));
    }

}
