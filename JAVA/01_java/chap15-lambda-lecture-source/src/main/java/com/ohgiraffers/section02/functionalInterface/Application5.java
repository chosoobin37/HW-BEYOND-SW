package com.ohgiraffers.section02.functionalInterface;

import java.util.Objects;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Application5 {

    public static void main(String[] args) {

        /* 수업목표. 표준 함수적 인터페이스 중 Predicate에 대해 이해하고 사용할 수 있다. */
        /* 설명. boolean 반환형을 가지는 메소드 관련 람다식 */
        /* 필기.
         *  JDK 8에서 빈번하게 사용되는 함수적 인터페이스를 표준 API로 제공
         *  1) Consumer: 리턴 값이 없는 accept() 메소드를 지니고 있다.(소비자 역할)
         *  2) Supplier: 매개변수가 없고 리턴 값이 있는 getXXX() 메소드를 지니고 있다.(생산자 역할)
         *  3) Function: 매개변수와 리턴값이 있는 applyXXX() 메소드를 지니고 있다.(매개변수를 리턴값으로 매핑하는 역할)
         *  4) Operator: Function과 같이 applyXXX() 메소드를 지니고 있다. 차이점은 매개변수 및 반환형의 타입이 통일되어 있다.
         *  5) Predicate: 매개변수와 boolean 값을 반환하는 testXXX()를 지니고 있다.(매개변수를 활용해서 boolean 반환
        * */
        Predicate<Object> predicate = value -> value instanceof String;
        System.out.println("문자열인지 확인: " + predicate.test("123"));
        System.out.println("문자열인지 확인: " + predicate.test(123));

    }
}