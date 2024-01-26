package com.ohgiraffers.section02.functionalInterface;

import java.math.BigDecimal;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Application3 {
    public static void main(String[] args) {
        
        /* 수업목표. 표준 함수적 인터페이스 중 Function 이해 및 사용 */
        /* 설명. 매개변수 및 반환형이 잇는 메소드 관련 람다식 */ 
        Function<String, Integer> function = str -> Integer.parseInt(str);
        String strValue = "12345";
        System.out.println(function.apply(strValue));

        BiFunction<String, String, Integer> biFunction =
                (str1, str2) -> Integer.valueOf(str1) + Integer.valueOf(str2);
        System.out.println(biFunction.apply("12345", "11111"));
    }
}
