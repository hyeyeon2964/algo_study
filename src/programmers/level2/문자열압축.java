package programmers.level2;

public class 문자열압축 {
    public static int solution(String s) {
        int answer = 0;


        StringBuffer sb = new StringBuffer();
        int cnt = 1;
        for (int i = 1; i <s.length()/2; i++) {
            String temp = s.substring(0, i);
            for (int j = i + 1; j <s.length(); j += i) {
                if (temp.contains(s.substring(i, j))) {
                    cnt++;
                }
                else {
                    if (cnt > 1) {
                        sb.append(Integer.toString(cnt));
                        sb.append(temp);
                        temp = s.substring(j,j+i);
                        cnt = 1;
                    }

                }
            }
            if (cnt > 1) {
                sb.append(Integer.toString(cnt));
                sb.append(temp);
            }
            answer = Math.min(answer, sb.length());
        }

        
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("aabbaccc"));
    }
}
