package com.ohgiraffers.section01.exception;

public class ExceptionTest {
    public void checkEnoughMoney(int money, int price) throws Exception {
        System.out.println("가지고 계신 돈은 " + money + "원입니다.");

        if (money > price) {
            System.out.println(price + "원 상품을 구입하기 위한 금액이 충분합니다.");
        } else {            // 예외 상황
            throw new Exception("돈을 열심히 벌어봅시다.");

        }
    }
}
