package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest02 {
    public void checkEnoughMoney(int price, int money)
            throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {

        
        /* 설명. throw를 통한 예외 발생 시 -> 바로 메소드를 호출한 곳으로 예외 인스턴스와 함께 반환 ㅍ */
        if (price < 0) {
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }
        if (money < 0) {
            throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
        }
        if (money < price) {
            throw new NotEnoughMoneyException("가진 돈보다 상품의 가격이 더 비쌉니다.");
        }
        System.out.println("충분한 돈이 있습니다. 즐거운 쇼핑 되세요 ~");
    }
}
