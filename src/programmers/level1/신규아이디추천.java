package programmers.level1;


public class 신규아이디추천 {
    public static int check_dot(String id, int index) {

        while (id.charAt(index) != '.') {
            index++;
        }
        return index;
    }
    public static String solution(String new_id) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        //1단계 소문자로 치환
        answer = new_id.toLowerCase();
        //2단계 숫자, 영어 소문자, 특정 특수문제 빼고 제거
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        //3단계 연속된 . 제거
        answer = answer.replaceAll("[.]{2,}", ".");
        //4단계 마침표 처음 끝 제거
        answer = answer.replaceAll("^[.]|[.]$", "");
        //5단계 빈 문자열이면 a대입
        if (answer.isEmpty()) {
            answer = "a";
        }
        //6단계 길이 조절
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("^[.]|[.]$", "");
        }
        //7단계
        if(answer.length() <= 2) {
            while (answer.length() != 3) {
                answer += answer.charAt(answer.length() -1);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(".......4343$%jdj."));
        System.out.println(solution(""));
    }
}
