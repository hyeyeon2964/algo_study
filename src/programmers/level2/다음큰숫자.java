package programmers.level2;

public class 다음큰숫자 {
    public int solution(int n) {
        int answer = 0;

       String binaryN = Integer.toBinaryString(n); // 이진수로 변환하는 메소드 사용
       int countN = 0;
       for(int i = 0; i<binaryN.length(); i++) {
           if(binaryN.charAt(i) == '1')
               countN++;
       }

       int num = n+1;
       while(true)
       {
           int countNum = 0;
           binaryN = Integer.toBinaryString(num);
           for(int i = 0; i<binaryN.length(); i++) {
               if(binaryN.charAt(i) == '1')
                   countNum++;
           }
           if(countN == countNum)
           {
               answer = num;
               break;
           }
           else
               num++;
       }
        return answer;
    }
}
