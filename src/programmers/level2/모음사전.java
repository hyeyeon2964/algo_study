package programmers.level2;

public class 모음사전 {
    public static int solution(String word) {
        int answer = 0;
        int regular = 781;

        char[] ch = {'A', 'E', 'I', 'O', 'U'};

        for (int i = 0; i<word.length(); i++) {
            for (int j = 0; j<5; j++) {
                if (word.charAt(i) == ch[j]) {
                    answer += regular * j + 1;
                }
            }
            regular = (regular - 1) / 5;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("AAAE"));
    }
}
