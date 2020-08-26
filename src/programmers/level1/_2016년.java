package programmers.level1;

import java.util.Calendar;

public class _2016년 {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, 2016);
        calendar.set(Calendar.MONTH, a-1); //0-11까지
        calendar.set(Calendar.DATE, b);

        int day = calendar.get(Calendar.DAY_OF_WEEK);
        return week[day-1];
    }
}

/*
       int[] monthDay={31,29,31,30,31,30,31,31,30,31,30,31};
        for (int i = 1; i < a; i++) {
            b+=monthDay[i-1];
        }
        switch(b%7){
        case 3:answer="SUN";break;
        case 4:answer="MON";break;
        case 5:answer="TUE";break;
        case 6:answer="WED";break;
        case 0:answer="THU";break;
        case 1:answer="FRI";break;
        case 2:answer="SAT";break;
        }
 */
