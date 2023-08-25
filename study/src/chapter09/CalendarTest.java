package chapter09;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
        String[] weekName = {"일", "월", "화", "수", "목", "금", "토"};
        String[] noonName = {"오전", "오후"};
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = (c.get(Calendar.MONTH)+1);
        int day = c.get(Calendar.DATE);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        System.out.println(year+"년" + month+"월"+day+"일");
        System.out.println(weekName[c.get(Calendar.DAY_OF_WEEK)-1]+"요일");
        System.out.println(hour +"시간" + minute+"분"+second+"초");
    }

    private static String toString(Calendar date) {
        return date.get(Calendar.YEAR)+ "년 " + (date.get(Calendar.MONTH)+1) +"월 " + date.get(Calendar.DATE) +"일 ";
    }

}
