package com.ohgiraffers.section05.overloading;

public class OverloadingTest {

    /* 수업목표. Overloading 이해 */

    /* 필기.
     *  메소드의 시그니처 -> public void method(int num) {}이라는 메소드의 메소드명과 파라미터 선언 부분
     *  = method(int num)
     *
     *  필기.
     *   오버로딩 -> 동일한 메소드 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 경우 적용하는 기술
     *   오버로딩 조건 -> 매개변수의 타입, 갯수, 순서를 다르게 해 하나의 클래스 내에 동일한 이름의 메소드 여러개 작성 가능
     *   메소드의 헤드부에 있어 시그니처를 제외한 부분이 다르게 작성되는 것은 인정X (시그니처 제외 부분 무관)
     *   ex) public void test() {}와  private String test() {} 다르다고 인정X
    * */
    public void test() {}

    public void test(int num) {}

    /* 설명. 매개변수의 갯수가 달라진 경우 인정 */ 
    public void test(int num1, int num2) {}

    /* 설명. 매개변수의 타입이 달라진 경우 인정 */
    public void test(int num, String str) {}
    
    /* 설명. 매개변수의 순서가 달라진 경우 인정 */
    public void test(String str, int num) {}

}
