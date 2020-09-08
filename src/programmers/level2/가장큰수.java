package programmers.level2;
import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {

    public String solution(int[] numbers) {
        String answer = new String();

        String[] str_num = new String[numbers.length];
        for(int i= 0; i<numbers.length; i++){
            str_num[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str_num, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        if(str_num[0].startsWith("0")){
            answer += "0";
        }
        else {
            for(int j = 0; j<str_num.length; j++){
                answer +=str_num[j];
            }
        }
        return answer;
    }
}
