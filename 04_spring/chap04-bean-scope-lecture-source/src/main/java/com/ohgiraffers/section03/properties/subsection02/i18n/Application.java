package com.ohgiraffers.section03.properties.subsection02.i18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        
        /* 설명. 
         *  i18n 소프트웨어의 국제화(Internationalization에서 첫 글자인 I와 마지막 글자인 n 가이에 알파벳 18개)
         *  -> 소프트웨어 국제화 하기 위해 처리할 다양한 작업들
         *  1) 언어, 지역별 언어
         *  2) OS/Platform별 인코딩
         *  3) 문자열 치환 방법
         *  4) 국제화 UI (문자열 크기 변화, 폰트, 아이콘 등)
         *  5) 쓰기 방향 차이
         *  6) 숫자, 공백, 화폐, 날짜, 주소, 측정 단위 등
         *  7) 타임존, 섬머타임 등 시각
         *  8) 문자열 정렬 방법
         *  - 
         *  우리가 다뤄본 예제 -> 그 중에서 1번에 해당하는 다국어 메시지 처리
        * */

        ApplicationContext context
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String error404MessageKR = context.getMessage("error.404", null, Locale.KOREA);
        String error500MessageKR
                = context.getMessage("error.500", new Object[]{"여러분", new java.util.Date()}, Locale.KOREA);

        System.out.println("I18N error.404 메시지: " + error404MessageKR);
        System.out.println("I18N error.500 메시지: " + error500MessageKR);
        System.out.println();

        String error404MessageUS = context.getMessage("error.404", null, Locale.US);
        String error500MessageUS
                = context.getMessage("error.500", new Object[]{"chomuckbab", new java.util.Date()}, Locale.US);

        System.out.println("I18N error.404 message: " + error404MessageUS);
        System.out.println("I18N error.500 message: " + error500MessageUS);
    }
}
