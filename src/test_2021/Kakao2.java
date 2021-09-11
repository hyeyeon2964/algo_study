package test_2021;
import java.util.*;
public class Kakao2 {
    public int solution(int n, int k) {
        String stringNumber = parse(n, k);
        List<Long> numbers = getNumberList(stringNumber);

        int answer = 0;

        for (long number : numbers) {
            if (number == 1) {
                continue;
            }

            if (isPrime(number)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean isPrime(long number) {
        int end = (int) Math.sqrt(number);

        for (int i = 2; i <= end; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private String parse(int n, int k) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.insert(0, n % k);
            n /= k;
        }
        return sb.toString();
    }

    private List<Long> getNumberList(String string) {
        List<Long> n = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        int range = string.length();

        for (int index = 0; index < range; index++) {
            char character = string.charAt(index);

            if (character != '0') {
                sb.append(character);
                continue;
            }
            if (sb.length() > 0) {
                long number = Long.parseLong(sb.toString());
                n.add(number);

                sb = new StringBuilder();
            }
        }
        if (sb.length() > 0) {
            long number = Long.parseLong(sb.toString());
            n.add(number);
        }
        return n;
    }
}
