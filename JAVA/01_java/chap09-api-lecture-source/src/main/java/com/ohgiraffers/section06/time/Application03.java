package com.ohgiraffers.section06.time;

import java.time.LocalDateTime;

public class Application03 {
    public static void main(String[] args) {

        /* 수업목표. time 패키지 클래스를 활용한 덧셈, 뺄셈, 빛 불변 특성 이해 */
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("현재 시간: " + localDateTime);
        System.out.println("주소값: " + System.identityHashCode(localDateTime));

        LocalDateTime localDateTime2 = localDateTime.plusMinutes(30);
        System.out.println("30분 후: " + localDateTime2);
        System.out.println("주소값: " + System.identityHashCode(localDateTime2));

        LocalDateTime localDateTime3 = localDateTime.minusHours(3);
        System.out.println("3시간 전: " + localDateTime3);
        System.out.println("주소값: " + System.identityHashCode(localDateTime3));

    }
}
