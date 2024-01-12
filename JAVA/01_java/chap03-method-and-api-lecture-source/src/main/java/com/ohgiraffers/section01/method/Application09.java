package com.ohgiraffers.section01.method;

public class Application09 {
    public static void main(String[] args) {

        /* 수업목표. 다른 클래스에 작성한 메소드 호출 */

        int first = 100;
        int second = 50;

        /* 설명. non-static 메소드 호출  */
        Calculator cal = new Calculator();
        System.out.println("두 수의 합은: " + cal.plusTwoNumbers(first, second));
        System.out.println("두 수 중 더 작은 수는 : " + cal.minTwoNumbers(first, second));

        /* 설명. static 메소드 -> 클래스명을 붙여서 호출  */
        System.out.println("두 수 중 더 큰 수는 : " + Calculator.maxTwoNumbers(first, second));


    }
}
