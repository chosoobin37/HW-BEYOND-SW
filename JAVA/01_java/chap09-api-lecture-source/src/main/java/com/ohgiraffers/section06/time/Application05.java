package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.stream.Stream;

public class Application05 {
    public static void main(String[] args) {

        /* 수업목표. time 패키지의 클래스들에 포캐칭 적용 및 출력 */
        String timeNow = "14:05:10";
        String dateNow = "2022-10-12";

        LocalTime localTime = LocalTime.parse(timeNow);
        LocalDate localDate = LocalDate.parse(dateNow);
        LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "T" + timeNow);

        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);

        /* 설명. 기본 패턴이 아닌 경우 */
        String timeNow2 = "14-05-10";
        String dateNow2 = "221005";

        LocalTime localTime2 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
        LocalDate localDate2 = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyMMdd"));

        System.out.println(localTime2);
        System.out.println(localDate2);

        /* 설명. time 패키지가 인식한 날짜 및 시간을 원하는 문자열로 반환 */ 
        String dateFormat = localDate2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String timeFormat = localTime2.format(DateTimeFormatter.ofPattern("HH-mm"));

        System.out.println(dateFormat);
        System.out.println(timeFormat);
    }
}
