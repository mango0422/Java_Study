package ch11.sec02.verify.exam02;

import java.util.*;

public class CalendarTodayInfo {
    public static void main(String[] args){
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        String strWeek = null;
        switch(week){
            case Calendar.MONDAY:
                strWeek = "월";
                break;
            case Calendar.TUESDAY:
                strWeek = "화";
                break;
            case Calendar.WEDNESDAY:
                strWeek = "수";
                break;
            case Calendar.THURSDAY:
                strWeek = "목";
                break;
            case Calendar.FRIDAY:
                strWeek = "금";
                break;
            case Calendar.SATURDAY:
                strWeek = "토";
                break;
            default:
                strWeek = "일";
        }
        System.out.println(year + "년 " + month + "월 " + day + "일 " + strWeek + "요일 " + hour + "시 " + minute + "분");
    }
}
