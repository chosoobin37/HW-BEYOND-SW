package com.ohgiraffers.section02.functionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. 표준 함수적 인터페이스 중 Operator 이해 및 사용 */
        /* 설명. 매개변수 및 반환형이 있지만 모두 같은 타입인 메소드 관련 람다식 -> 제네릭 타입 동일 */
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("hello, ", "world!"));

        UnaryOperator<String> unaryOperator = str -> str + "World2!";
        System.out.println(unaryOperator.apply("hello2, "));
    }
}
