package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws PriceNegativeException {

        if (price < 0) {
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }
    }
}
