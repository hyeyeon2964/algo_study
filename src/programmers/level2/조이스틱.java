package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;

public class 조이스틱 {

    public int solution(String name) {
        int answer = 0;
        int count = 0;
        int index = 0;
        int[] check = new int[name.length()];
        char c = 'A';
        ArrayList<Character> list = new ArrayList<>();
        Arrays.fill(check, 0);

        for(int i = 0; i < 26; i++){
            list.add(c);
            c++;
        }

        while(count != name.length())
        {
            int listIndex = list.indexOf(name.charAt(index));

            if(name.charAt(index) == 'A')
            {
                int j = index;
                int right = 0;
                int left = 0;
                while (name.charAt(j) == 'A' && j != name.length())
                {
                    right++;
                    j++;
                }
                while (name.charAt(j) == 'A' && j != index)
                {
                    left++;
                    if(j == 0)
                        j = name.length() -1;
                    else
                        j--;
                }

                if(right >= left)
                {

                }
            }
        }

        return answer;
    }
}
