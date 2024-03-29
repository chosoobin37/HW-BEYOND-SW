package com.ohgiraffers.section01.intro;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 람다식 활용을 위한 인터페이스 관리 기법 이해 */
        /* 설명. 내부 인터페이스인 Sum의 하위 구현체에 존재하는 메소드 오버라이딩 -> 람다식 활용 */
        /* 설명. 람다식으로 내부 인터페이스의 하위 구현체를 변수명으로 정의 */

        OuterCalculator.Sum sum = (x, y) -> x + y;
        OuterCalculator.Minus minus = (x, y) -> x - y;
        OuterCalculator.Multiply multiply = (x, y) -> x * y;
        OuterCalculator.Divide divide = (x, y) -> x / y;

        System.out.println("20과 10의 합: " + sum.sumTwoNumber(20, 10));
        System.out.println("20과 10의 합: " + minus.minusTwoNumber(20, 10));
        System.out.println("20과 10의 합: " + multiply.multiplyTwoNumber(20, 10));
        System.out.println("20과 10의 합: " + divide.divideTwoNumber(20, 10));
    }
}
