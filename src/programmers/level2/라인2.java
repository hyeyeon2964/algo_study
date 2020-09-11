package programmers.level2;

import java.util.Map;

public class 라인2 {
    public static int solution(String answer_sheet, String[] sheets){
        int answer = 0;
        int checkAnswer = 0;
        int question =0;
        int longQ = 0;
        int checkLong =0;

        for(int i = 0; i<sheets.length; i++) {
            for (int j = i + 1; j < sheets.length; j++) {
                question = 0;
                checkLong = 0;
                checkAnswer = 0;
                longQ = 0;
                for (int k = 0; k < answer_sheet.length(); k++) {

                    if (answer_sheet.charAt(k) != sheets[i].charAt(k) && sheets[i].charAt(k) == sheets[j].charAt(k)) {
                            question++;
                            checkLong++;
                        if (longQ < checkLong)
                            longQ = checkLong;
                }
                    else {
                        checkLong = 0;
                    }
                }
                checkAnswer = question + (int)Math.pow(longQ,2);
                if(answer < checkAnswer)
                    answer = checkAnswer;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String answer_sheet1 = "4132315142";
        String [] sheets1 = {"3241523133","4121314445","3243523133","4433325251","2412313253"} ;
        String answer_sheet2 = "53241";
        String [] sheets2 = {"53241", "42133", "53241", "14354"} ;
        String answer_sheet3 = "24551";
        String [] sheets3 = {"24553", "24553", "24553", "24553"} ;
        System.out.println(solution(answer_sheet1, sheets1)); //17
        System.out.println(solution(answer_sheet2, sheets2)); //0
        System.out.println(solution(answer_sheet3, sheets3)); //2

    }
}
