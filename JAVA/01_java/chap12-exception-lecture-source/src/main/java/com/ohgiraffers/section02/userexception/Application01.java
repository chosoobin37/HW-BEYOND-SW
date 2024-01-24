package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 사용자 정의의 예외클래스 정의 후 발생한 사용자 정의의 예외 처리 */
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(30000,50000);
        } catch (PriceNegativeException e) {
            throw new RuntimeException(e);
        }
    }
}
