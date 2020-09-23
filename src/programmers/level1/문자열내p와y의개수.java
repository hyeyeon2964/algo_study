package programmers.level1;
/*

대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를 들어 s가 pPoooyY면 true를 return하고 Pyy라면 false를 return합니다.
 */
public class 문자열내p와y의개수 {
    boolean solution(String s) {
        boolean answer = true;

        int countP=0;
        int countY=0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P')
                countP++;
            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                countY++;
        }
        if(countP==0 && countY==0)
            return true;

            if (countP==countY)
                return true;
            else
                return false;
    }
}