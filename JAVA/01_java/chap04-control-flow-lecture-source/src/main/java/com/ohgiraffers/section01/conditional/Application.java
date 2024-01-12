package com.ohgiraffers.section01.conditional;
/* 설명. 실행용 클래스 구분 -> main method only here */
public class Application {
    public static void main(String[] args) {

        A_if aClass = new A_if();

        /* 필기. 단독 if문 흐름 확인용 메소드 호출 */
//        aClass.testSimpleIfStatement();

        /* 필기. 중첩 if문 흐름 확인용 메소드 호출 */
//        aClass.testNestedIfStatement();

        B_ifElse bClass = new B_ifElse();
        bClass.testSimpleIfElseStatement();

    }
}
