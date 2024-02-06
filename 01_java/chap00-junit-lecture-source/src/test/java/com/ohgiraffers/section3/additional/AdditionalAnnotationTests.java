package com.ohgiraffers.section3.additional;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

/* 설명. Order Annotation으로 테스트 메소드 실행순서 정하기 위해서 상단에 추가 */ 
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdditionalAnnotationTests {

    /* 수업목표. Junit에서 제공하는 메소드 관련 추가 Annotation 사용 */

    /* 필기. 해당 테스트를 무시할 때 사용하는 Annotation */
    @Disabled
    @Test
    public void testIgnore() {
    }

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void testTimeout() throws InterruptedException {
        Thread.sleep(200);
//        Thread.sleep(1200);       // 예외 발생
    }

    @Test
    @Order(10)
    public void testFirst() {    }

    @Test
    @Order(30)
    public void testThird() {    }

    @Test
    @Order(20)
    public void testSecond() {    }

    @RepeatedTest(10)
    public void testRepeat() {

    }
}
