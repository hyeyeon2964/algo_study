package test_2021;

public class hmuson1 {
    public static int solution(String s) {
        int answer = 1234;
        String s1 = s;
        String str = "";
        boolean check = true;
        while (!s.equals(str)) {
            if (check) {
                str = s;
                check = false;
            }
            s = str;
            str = str.replaceAll("01", "");
            str = str.replaceAll("10", "");
        }
        answer = str.length();

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("0110011"));
    }
}