package com.ohgiraffers.section06.time;

import java.time.*;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. time 패키지에서 제공하는 클래스 사용 용법 이해 */
        LocalTime timeNow = LocalTime.now();
        LocalTime timeOf = LocalTime.of(18, 30, 20);
        System.out.println("timeNow = " + timeNow);     // 현재 시간
        System.out.println("timeOf = " + timeOf);       // 지정한 시간

        LocalDate dateNow = LocalDate.now();
        LocalDate dateOf = LocalDate.of(2024, 1, 22);
        System.out.println("dateNow = " + dateNow);
        System.out.println("dateOf = " + dateOf);

        LocalDateTime dateTimeNow = LocalDateTime.now();
        LocalDateTime dateTimeOf = LocalDateTime.of(dateNow, timeNow);
        System.out.println("datetimeNow = " + dateTimeNow);
        System.out.println("datetimeOf = " + dateTimeOf);

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf, timeOf, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedADateTimeNow = " + zonedDateTimeNow);
        System.out.println("zonedDateTimeOf = " + zonedDateTimeOf);

    }
}
