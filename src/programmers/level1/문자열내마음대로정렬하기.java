package programmers.level1;
import java.util.*;
public class 문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {

            Arrays.sort(strings, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    char c1 = s1.charAt(n);
                    char c2 = s2.charAt(n);

                    if (c1 == c2) { //만약 그 인덱스의 문자가 같을 때
                        return s1.compareTo(s2);
                    } else return c1 - c2;
                }
            });

            return strings;
        }
    }
