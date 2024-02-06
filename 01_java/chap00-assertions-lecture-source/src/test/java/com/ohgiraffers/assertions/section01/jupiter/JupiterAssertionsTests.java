package com.ohgiraffers.assertions.section01.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class JupiterAssertionsTests {
    /* 수업목표. junit5에서 제공하는 Assertions 제공 메소드 이해 및 활용*/

    /* 목차. 1) assertEquals */
    /* 필기. asserEquals (expected, actual) 메소드 -> 실제 값과 기대값의 일치 여부를 동일성으로 판단*/

    @Test
    public void testAssertEquals() {

        /* 설명. 1) given */
        int firstNum = 10;
        int secondNum = 20;
        int expected = 30;

        /* 설명. 2) when */
        Calculator calculator = new Calculator();
        int result = calculator.plusTwoNumbers(firstNum, secondNum);

        /* 설명. 3) then */
        Assertions.assertEquals(expected, result);
//        Assertions.assertEquals(expected, result, 1);
//        Assertions.assertEquals(expected, result, "정확하지 않다굿 ,, !!");

    }

    /* 목차. 2) assertNotEquals */
    /* 필기. assertNotEquals (expected, actual) 메소드 -> 실제 값과 기대 값의 불일치 여부를 동일성으로 판단  */
    /* 설명. equals()와 hashCode()가 오버라이딩 된 경우 -> 동등비교로 판단 */
    @Test
    @DisplayName("인스턴스 동일성 비교 테스트")
    void testAssertNotEqualsWithInstance() {
        //given
        Object obj1 = new Object();

        // when
        Object obj2 = new Object();

        // then
        Assertions.assertNotEquals(obj1, obj2);
    }

    /* 목차. 3) assertNull */
    @Test
    @DisplayName("Null Test")
    void testAsserttNull() {
        String str;
        str = null;
        Assertions.assertNull(str);
    }

    /* 목차. 4) assertNotNull */
    @Test
    @DisplayName("notNull test")
    void testAssertNotNull() {
        String str;
        str = "java";
        Assertions.assertNotNull(str);
    }

    /* 목차. 5) 자주쓰는 단정문 */
    /* 설명. assertTrue(), assertFalse() */

    /* 목차. 6) assertAll */
    @Test
    @DisplayName("동시에 여러가지 값에 대한 검증 수행 테스트")
    void testAll() {

        //given
        String firstName = "길동";
        String lastName = "홍";

        //when
        Person person = new Person(firstName, lastName);

        //then
        Assertions.assertAll(
                "그룹화된 테스트의 이름 (테스트 실패 시 보여짐)",
                () -> Assertions.assertEquals
                        (firstName, person.getFirstName(), () -> "firstName이 잘못됨"),
                () -> Assertions.assertEquals
                        (lastName, person.getLastName(), () -> "lastName이 잘못됨")
        );
    }

    /* 목차. 7) assertThrows */
    @Test
    @DisplayName("void 메소드의 경우 exception이 발생하는지 테스트")
    void testAssertThrows() {
        int firstNum = 10;
        int secondNum = 0;
        String expectedErrorMessage = "0으로 나눌 수 없습니다. ";

        PositiveNumberValidator validator = new PositiveNumberValidator();
        Exception exception = Assertions.assertThrows(
                Exception.class,
                () -> validator.checkDividableNumbers(firstNum, secondNum)
        );

        Assertions.assertAll(
                ()-> Assertions.assertInstanceOf(IllegalArgumentException.class, exception,
                        () -> "예외 타입 일치 X"),
                () -> Assertions.assertEquals(expectedErrorMessage, exception.getMessage(),
                        () -> "예외 메시지 일치 X")
        );
    }

}
