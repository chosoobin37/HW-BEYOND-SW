package com.ohgiraffers.section02.package_and_import;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 패키지에 대해 이해 */
        com.ohgiraffers.section01.method.Calculator cal
                = new com.ohgiraffers.section01.method.Calculator();

        /* 목차. 1) non-static 메소드 호출 */
        int plusResult = cal.plusTwoNumbers(100, 20);
        System.out.println("100과 20의 합: " + plusResult);

        /* 목차. 2) static 메소드 호출 */
        int maxResult
                = com.ohgiraffers.section01.method.Calculator.maxTwoNumbers(100, 20);
        System.out.println("두 수 중 큰 값: "+ maxResult);

    }
}
