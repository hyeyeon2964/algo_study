package leetcode;

public class DailyTemperatures_739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for(int i = 0; i<temperatures.length; i++) {
            int days = 0;
            for(int j = i+1; j<temperatures.length; j++) {
                days++;
                if(temperatures[i] < temperatures[j]) {
                    result[i] = days;
                    break;
                }
            }
        }
        return result;
    }
}
