package com.ohgiraffers.section05.calendar;

import java.lang.reflect.GenericArrayType;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. java.util.Calendar 클래스 사용법 이해 및 사용 */
        /* 필기.
         *  Date형 대비 개선점
         *  1. timezone 관련 기능 추가
         *  2. 윤년 관련 기능 내부 추가
         *  3. 날짜 및 시간 필드개념 추가 -> 불필요한 메소드 감소
        * */

        /* 설명. Calendar 자료형 -> 생성자 통해 객체 생성 가능 */
        Calendar cal = Calendar.getInstance();
        System.out.println("cal = " + cal);

        Calendar cal2 = new GregorianCalendar();
        System.out.println("cal2 = " + cal2);

        int year = 2000;
        int month = 2;
        int dayoFMonth = 7;
        int hour = 18;
        int min = 30;
        int second = 00;

        Calendar birthDay = new GregorianCalendar(year, month, dayoFMonth, hour, min, second);
        System.out.println(birthDay);

        /* 설명. GregorianCalendar 객체가 가진 값 확인 */
        System.out.println("태어난 해: " + birthDay.get(1));
        System.out.println("태어난 해: " + birthDay.get(Calendar.YEAR));
        System.out.println("태어난 월: " + (birthDay.get(2)+1));        // get() 메소드로 반환받은 값에 +1 해야 원하는 월의 개념
        System.out.println("태어난 월: " + (birthDay.get(Calendar.MONTH)+1));
        System.out.println("태어난 일: " + birthDay.get(5));
        System.out.println("태어난 일: " + birthDay.get(Calendar.DAY_OF_MONTH));

        /* 설명. 요일 */
        String day = "";
        switch (birthDay.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY: day="일"; break;
            case Calendar.MONDAY: day="월"; break;
            case Calendar.TUESDAY: day="화"; break;
            case Calendar.WEDNESDAY: day="수"; break;
            case Calendar.THURSDAY: day="목"; break;
            case Calendar.FRIDAY: day="금"; break;
            case Calendar.SATURDAY: day="토"; break;
        }
        System.out.println("내 생일은" +day+"요일이야!");

        /* 설명. 하나씩 호출 */
        System.out.println("AM/PM: "+birthDay.get(Calendar.AM_PM));
        System.out.println("hourOfDay: " + birthDay.get(Calendar.HOUR_OF_DAY));
        System.out.println("hour: " + birthDay.get(Calendar.HOUR));
        System.out.println("min: " + birthDay.get(Calendar.MINUTE));
        System.out.println("sec: " + birthDay.get(Calendar.SECOND));


        /* 설명. SimpleDateFormat 활용하기 -> java.util.Date 형으로 변환 후 사용 */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyy/MM/dd hh:mm:ss E요일");
        String birthDayString = sdf.format(new java.util.Date(birthDay.getTimeInMillis()));
        System.out.println("birthDay = " + birthDayString);
    }
}
