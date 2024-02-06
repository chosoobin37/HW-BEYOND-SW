package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator; // Calculator라고 불러도 사용 가능

public class Application02 {
    public static void main(String[] args) {
        /* 수업목표. import에 대해 이해 */

        /* 목차. 1) non-static method */
        Calculator cal = new Calculator();
        int sub = cal.subTwoNumbers(100,50);
        System.out.println("100 - 50 = "+sub);

        /* 목차. 2) static method */
        System.out.println("두 수 중 큰 값은: "+Calculator.maxTwoNumbers(22,80));

    }
}
