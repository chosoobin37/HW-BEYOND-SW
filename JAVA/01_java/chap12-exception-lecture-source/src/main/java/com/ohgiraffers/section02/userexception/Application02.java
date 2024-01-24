package com.ohgiraffers.section02.userexception;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. finally를 활용한 try-catch문 이해 및 활용 */
        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(20000, 50000);
        } catch (Exception e) {
            System.out.println("충분한 돈을 가지고 있는지 유효성 체크 결과 문제: " + e.getMessage());
        } finally {
            /* 설명. try 구문에서 예외가 발생 유무와 상관없이 반드시 실행해야 하는 부분   */
            System.out.println("finally 블럭 내용 동작 ...");
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
