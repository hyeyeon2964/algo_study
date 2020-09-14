package programmers.level2;

public class 라인3 {
    public static int solution(String s, int n) {
        int answer = 0;
        int length =0;
        int lengthCheck = 0;
        int fixCount = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 1) {
                lengthCheck++;
                if(lengthCheck > length)
                    length = lengthCheck;
            }
            else{

            }
        }

        return length;
    }
    public static void main(String[] args) {
        String s1 = "111011110011111011111100011111";
        String s2 = "001100";
        int n1 = 3;
        int n2 = 5;
        System.out.println(solution(s1,n1)); //18
        System.out.println(solution(s2,n2)); //6
    }
}
