package test;

public class etoos1 {

    public int finishTime (String[] arr)
    {
        int num = 0;
        for(int i = 0; i<arr.length; i++){
            if (0 != Integer.parseInt(arr[i]))
            {
                num++;
            }
        }
        return num;
    }
    public String[] solution(String[] record) {
        String[] answer = {};
        int[] finishNum = new int[record.length];
        for(int i = 0; i<record.length; i++)
        {
            String[] info = record[i].split(":");
            String[] finish = info[info.length].split(",");
            finishNum[i] = finishTime(finish);

        }
        return answer;
    }
}
