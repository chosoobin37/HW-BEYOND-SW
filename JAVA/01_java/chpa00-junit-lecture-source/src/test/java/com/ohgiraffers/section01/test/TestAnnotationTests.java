package com.ohgiraffers.section01.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/* 필기. 테스트 클래스들은 클래스명 끝네 'Tests' 붙여 작명 */

public class TestAnnotationTests {

    /* 수업목표. Junit5의 기본 Annotation 사용 */
    /* 필기.
     *  단위테스트 -> layered architecture에서 각 계층마다  단위 메소드 테스트
     *  통합테스트 -> layered 단위가 아닌 전체 기능 동작 테스트
     *  테스트 케이스 -> 테스트 대상이 되는 기능에 대해 시나리오 별로 어떤 것을 테스트 하는지에 대해 정의
     * */


    /* 설명.
     *  @Test -> 기본적인 테스트 메소드를 만들기 위해 사용하는 Annotation
     *  @Test -> 단독으로 실행 가능 (main 아니어도 실행 가능)
     * */
    @Test

    /* 설명. @DisplayName -> 해당 테스트 메소드로 테스트하는 테스트케이스에 대해 작성 */
    @DisplayName("testMethod01 Success Check")
    public void testMethod1() {
    }

    /* 설명. 과거 -> 공백문자를 언더스코어로 표기한 한글 메소드 형태로 테스트 메소드 작성 */
    @Test
    @DisplayName("우선순위 테스트")
    public void 매개변수로_1과_3을_넘겼을때_합계를_int형으로_잘_반환하는지_확인() {

    }

}
