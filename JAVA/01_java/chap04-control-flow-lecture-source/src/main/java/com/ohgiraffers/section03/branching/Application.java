package com.ohgiraffers.section03.branching;

public class Application {
    public static void main(String[] args) {

        A_break aClass= new A_break();

        /* 필기. break문 흐름 확인용 메소드 */
//        aClass.testSimpleBreakStatement();
//        aClass.testPrintStarsWithBreakStatement();

        B_continue bClass = new B_continue();

        /* 필기. continue문 흐름 확인용 메소드 */
        bClass.testSimpleContinueStatement();


    }
}
