package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

import java.security.spec.ECField;

public class Application03 {
    public static void main(String[] args) {
        
        /* 수업목표. multi-catch 구문 이해 및 활용 */
        ExceptionTest02 et = new ExceptionTest02();
        try {
            et.checkEnoughMoney(20000, 50000);
        } catch (PriceNegativeException | MoneyNegativeException e) {
            System.out.println("두 개의 예외처리: " + e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println("한 개의 예외처리: " + e.getMessage());
        }
        /* 필기.
         *  예외 클래스, 예외 발생경로, 예외 메시지 등을 stack 호출 역순으로 빨간 글씨의 로그 형태로 나타내는 기능
        * */
        finally {
            System.out.println("반드시 실행되는 finally 동작 ...");
        }
        System.out.println("프로그램을 종료합니다.");
        
        /* 필기.
         *  catch 블럭이 많은 경우 -> 위에서 아래로 예외 타입 확인
         *  부모 타입에 해당하는 예외처리 -> 아래쪽에 작성
        * */
    }
}
