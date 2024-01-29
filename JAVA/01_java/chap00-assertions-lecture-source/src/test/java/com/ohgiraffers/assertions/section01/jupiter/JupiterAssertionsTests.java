package com.ohgiraffers.assertions.section01.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JupiterAssertionsTests {

    /* 수업목표. junit5에서 제공하는 Assertions 제공 메소드 이해 및 활용*/
    @Test
    public void testAssertEquals() {

        /* 설명. 1) given */
        int firstNum = 10;
        int secondNum = 20;
        int expected = 31;

        /* 설명. 2) when */
        Calculator calculator = new Calculator();
        int result = calculator.plusTwoNumbers(firstNum, secondNum);

        /* 설명. 3) then */
        Assertions.assertEquals(expected, result);


    }
}
