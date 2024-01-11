package com.ohgiraffers.section01.method;

public class Application03 {
    /*  */
    /* 필기.
     *  변수의 종류 -> 자료형과는 다른 구분방식
     *  1. 지역변수 2. 매개변수 3. 전역변수(field) 4. 클래스(static) 변수
    * */
    public static void main(String[] args) {
        Application03 app3 = new Application03();
        app3.testMethod(10);
        app3.testMethod(19);
        app3.testMethod(15);
        app3.testMethod('a');
        app3.testMethod((int)12.34);
        int age = 30;
    }
    /* 설명. 정수를 주면 나이를 출력해주는 기능을 가진 method (non-static) */
    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세입니다.");
    }
}

