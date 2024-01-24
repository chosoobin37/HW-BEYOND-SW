package com.ohgiraffers.section01.exception;

public class Application {
    public static void main(String[] args) throws Exception {
        
        /* 수업목표. 예외 이해 및 처립 문법 활용 */

        /* 필기. 예외처리 방법
         *  1. throws를 통한 위임
         *  2. try-catch를 통한 처리
        * */
        ExceptionTest et = new ExceptionTest();

        /* 설명. try-catch 구문을 통해 프로그램이 종료되지 않게 처리 가능 */ 
        try {
            /* 설명. catch 구문으로 처리할 예외가 발생하는 부분 try 구분으로 묶을 수 있음
            *   -> 너무 크지 않은 범위 내에서 적당히 관련 있는 것만 지정할 것 */
            et.checkEnoughMoney(10000, 5000);
            et.checkEnoughMoney(10000, 50000);
            System.out.println("이전에 문제 없었으면 실행될 try의 나머지 부분");
        } catch (Exception e) {
            
            /* 설명. try 구문에서 발생한 예외를 처리하기 위한 구문
             *  -> 원하는 방식으로 예외 상황에 대해 처리 가능 (단순 ㄴ출력 또는 예외 타입에서 제공하는 메소드를 활용한 처리 모두 가능)
             *  catch 구문에 아무런 처리 구문도 작성하지 않으면 예외 발생 유무 파악하기 어려움 
             *  -> 간단한 처리라도 반드시 작성
            * */
//            System.out.println("돈이 부족합니다.");
//            System.out.println(e.getClass());
            System.out.println("예외 발생 시 메시지 확인: " + e.getMessage());

            /* 설명. try 구문에서 발생한 예외 타입을 받아 jvm이 처리해주는 방식 */
            e.printStackTrace();

            /* 설명. 원하는 시점에 프로그램 종료 가능 (권장 X) */
//            System.exit(0);
        }
        System.out.println("프로그램이 종료됩니다.");
    }
}
