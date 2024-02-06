package com.ohgiraffers.section01.method;

public class Application08 {
    public static void main(String[] args) {
        /* 수업목표. static 메소드 호출 가능 */

        System.out.println("10과 20의 합: " + sumTwoNumbers(10, 20));

        // 호출하는 static 메소드가 같은 클래스 내에 존재하면 '클래스명.' 생략 가능
        // System.out.println("10과 20의 합: " + Application08.sumTwoNumbers(10, 20));
    }

    public static int sumTwoNumbers(int first, int second) {
        return first + second;
    }
}
