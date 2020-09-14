package programmers.level2;

public class Kakao1 {

    public static String solution(String new_id) {

        String answer = "";
        answer = new_id;

        answer = answer.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9_.-]", "");
        answer = answer.replaceAll("[.]{2,}", ".");



        if(answer.length() >0 && answer.charAt(0) == '.'){
            answer = answer.substring(1);
        }

        if (answer.length() >0 &&(answer.charAt(answer.length()-1) == '.')){
            answer = answer.substring(0, answer.length()-1);
        }

        if(answer.length() == 0){
            answer = "a";
        }
        if(answer.length() >= 16){
            answer = answer.substring(0, 15);
            if (answer.charAt(answer.length()-1) == '.'){
                answer = answer.substring(0, answer.length()-1);
            }
        }
            while(answer.length() <= 2){
                answer += answer.charAt(answer.length()-1);
            }

        return answer;
    }

    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String new_id2 = "z-+.^.";
        String new_id3 = "=.=";
        String new_id4 = "123_.def";
        String new_id5 = "c$%($%*(";


        System.out.println(solution(new_id));
        System.out.println(solution(new_id2));
        System.out.println(solution(new_id3));
        System.out.println(solution(new_id4));
        System.out.println(solution(new_id5));

    }
}
