package com.ohgiraffers.section05.calendar;

import java.lang.reflect.GenericArrayType;
import java.util.Calendar;
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
        int dayoFMonth = 3;
        int hour = 18;
        int min = 30;
        int second = 00;

        Calendar birthDay = new GregorianCalendar(year, month, dayoFMonth, hour, min, second);
        System.out.println(birthDay);

        /* 설명. GregorianCalendar 객체가 가진 값 확인 */
        System.out.println("태어난 해: " + birthDay.get(1));

    }
}
