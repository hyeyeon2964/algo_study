package test_2021;

import java.util.*;

public class Kakao3 {
    static int reTime;
    static int reCharge;
    static int unitTime;
    static int unitCharge;
    public static int[] solution(int[] fees, String[] records) {
        int[] answer;
        ArrayList<String> carList = new ArrayList<>();
        reTime = fees[0];
        reCharge = fees[1];
        unitTime = fees[2];
        unitCharge = fees[3];
        Map<String, Integer> parkingTime = new HashMap<>();
        Map<String, String> parkingInfo = new HashMap<>();
        for (String str : records) {
            String[] temp = str.split(" ");

            if (!carList.contains(temp[1])) {
                carList.add(temp[1]);
            }
            if (temp[2].equals("IN")) {
                parkingInfo.put(temp[1], temp[0]);
            }
            else if (temp[2].equals("OUT")) {
                String[] inTime = parkingInfo.get(temp[1]).split(":");
                String[] outTime = temp[0].split(":");
                int time = (Integer.parseInt(outTime[0]) * 60 + Integer.parseInt(outTime[1]))
                        - (Integer.parseInt(inTime[0]) * 60 + Integer.parseInt(inTime[1]));
                parkingTime.put(temp[1], parkingTime.getOrDefault(temp[1], 0)+time);
                parkingInfo.put(temp[1], "");

            }
        }

        String[] car = carList.toArray(new String[carList.size()]);
        Arrays.sort(car);
        for (String  str : car) {
            if (!parkingInfo.get(str).equals("")) { //11:59분 처리
                String[] inTime = parkingInfo.get(str).split(":");
                int time = (23 * 60 + 59)
                        - (Integer.parseInt(inTime[0]) * 60 + Integer.parseInt(inTime[1]));
                parkingTime.put(str, parkingTime.getOrDefault(str, 0)+time);

            }
        }
        answer = new int[car.length];

        int money;
        for (int i = 0; i<answer.length; i++) {
            int time = parkingTime.get(car[i]);
            money = 0;
            if (reTime < time) {
                double n = Math.ceil(time - reTime) / unitTime;
                money += (int) Math.ceil(n) * unitCharge + reCharge;
                answer[i] = money;
            }
            else {
                answer[i] = reCharge;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] fees = {180, 5000, 10, 600};

        String[] records = {
                "05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"
        };

        System.out.println(Arrays.toString(solution(fees, records)));
    }

}
