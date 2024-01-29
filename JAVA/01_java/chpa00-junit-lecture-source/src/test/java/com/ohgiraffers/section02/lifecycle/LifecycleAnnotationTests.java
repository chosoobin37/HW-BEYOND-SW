package com.ohgiraffers.section02.lifecycle;

import org.junit.jupiter.api.*;

public class LifecycleAnnotationTests {
    /* 수업목표. 테스트 메소드의 실핸 전 후 동작하는 Annotation 사용 */
    /* 설명.
     *  모든 테스트 메소드와 라이프사이클 관련 메소드 -> abstract X, void 반환형 필수
     *  접근 제어자 필수 X (default) -> private 불가능
    * */

    /* 필기. 테스트가 실행되기 전 딱 한 번만 실행 */
    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll");
    }
    /* 필기. 각각의 테스트 메소드가 실행되기 전 실행,
        주로 테스트 전에 필요한 목업 데이터 사전 세팅 목적으로 사용 */
    @BeforeEach
    public void beforeEach() {
        System.out.println("beforeEach");
    }
    @Test
    public void test1() {
        System.out.println("test1");
    }
    @Test
    public void test2() {
        System.out.println("test2");
    }
    /* 필기.
     *  각각의 테스트 메소드가 동작한 직후 동작
     *  주로 단위 테스트들이 수정된 이후 사용한 자원 반납/해제 목적 사용
    * */
    @AfterEach
    public void afterEach() {
        System.out.println("afterEach");
    }
    /* 필기. 모든 단위 테스트가 완전히 끝난 후 딱 한 번만 실행 */
    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll");
    }
}
