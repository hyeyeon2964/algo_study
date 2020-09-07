package programmers.level2;


public class Hindex {
    public int solution(int[] citations) {
        int answer = 0;

        int max = 0;
        int min = 0;
        int hIndex = 0;
        int i = 0;
        while(true) {
            max = 0;
            min = 0;
            i =0;

            if(citations[i] >= hIndex){
                max++;
                i++;
            }
            else if(citations[i] <= hIndex){
                min++;
                i++;
            }
            else if(i == citations.length-1)
                hIndex++;

            if(hIndex > max || hIndex < min)
                break;

        }
        return hIndex;
    }
}
