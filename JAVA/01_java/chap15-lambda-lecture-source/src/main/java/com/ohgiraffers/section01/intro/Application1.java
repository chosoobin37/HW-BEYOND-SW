package com.ohgiraffers.section01.intro;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 람다식 이해 및 활용 -> FunctionalInterface */
        
        /* 필기. 1) 인터페이스 구현한 구현체(Impl 클래스) 이용한 방식 -> 동적 바인딩 활용 */
        Calculator c1 = new CalculatorImpl();
        System.out.println("10과 20의 합 = " + c1.sumTwoNumber(10, 20));

        /* 필기. 2) 익명 클래스 활용 방식 -> 인터페이스의 하위 구현체 */
        Calculator c2=new Calculator() {
            @Override
            public int sumTwoNumber(int num1, int num2) {
                return (num1 + num2) * 2;
            }
        };
        System.out.println("10과 20의 합에 2를 곱한 값 = " + c2.sumTwoNumber(10, 20));

        /* 필기. 3) 람다식 활용 방법*/
        Calculator c3 = (x, y) -> (x + y) * 3;
        Calculator c4 = (x, y) -> {return (x + y) * 3;};
        System.out.println("10과 20의 합에 3를 곱한 값 = " + c3.sumTwoNumber(10, 20));
        System.out.println("10과 20의 합에 3를 곱한 값 ver.2 = " + c3.sumTwoNumber(10, 20));
    }
}
