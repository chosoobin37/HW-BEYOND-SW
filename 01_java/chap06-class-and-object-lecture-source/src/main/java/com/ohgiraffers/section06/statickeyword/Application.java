package com.ohgiraffers.section06.statickeyword;

public class Application {
    public static void main(String[] args) {
        /* 수업목표. static keyword 이해 */
        /* 필기.
         *  static -> 프로그램이 실행될 때 정적 메모리 영역(static or class 영역)에 할당하는 키워드
         *  여러 인스턴스가 공유해서 사용할 목적의 공간 ex) singleton 객체
        * */

        /* 목차. 1) static 키워드를 필드에서 사용 */
        StaticFieldTest stf1 = new StaticFieldTest();

        /* 설명. 현재 두 필드가 가지고 있는 값 확인 */
        System.out.println("non-static field: " + stf1.getNonStaticCount());
        System.out.println("static field: " + StaticFieldTest.getStaticCount());

        /* 설명. 각 필드값들을 하나씩 증가 */
        stf1.increaseNonStaticCount();
        StaticFieldTest.increaseStaticCount();

        /* 설명. 두 필드값 확인 */
        System.out.println("non-static field: " + stf1.getNonStaticCount());
        System.out.println("static field: " + StaticFieldTest.getStaticCount());

        /* 설명. 새로운 객체 생성 */
        StaticFieldTest stf2 = new StaticFieldTest();
        System.out.println("non-static field: " + stf2  .getNonStaticCount());
        System.out.println("static field: " + StaticFieldTest.getStaticCount());
    }
}
