package test_2021;

public class danal1 {

    public static String zeroCheck(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) != '0') {
                sb.append(s.substring(i));
                return sb.toString();
            }
        }
        return "0";
    }
    public static long solution(long a, long b) {
        long answer = 1;

        for (int i = 0; i < b; ++i) {
            answer = (answer * a) % 100000;
        }

        return answer;
    }
//    public static long solution(long a, long b) {
//        long answer = 0;
//        long long n = (long long) Math.pow(a, b);
//        String s = Long.toString(answer);
//        s = zeroCheck(s.substring(s.length() - 5));
//
//        answer = Long.parseLong(s);
//        return answer;
//    }

    public static void main(String[] args) {
        System.out.println(solution(123456789, 12345));
    }
}
