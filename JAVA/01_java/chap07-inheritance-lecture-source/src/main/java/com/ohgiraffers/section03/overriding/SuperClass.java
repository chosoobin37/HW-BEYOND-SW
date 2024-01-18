package com.ohgiraffers.section03.overriding;

public class SuperClass {

    /* 수업목표. OverRiding 이해 */

    /* 필기. Override 성립 조건
     *  1. 메소드의 이름이 동일해야 함
     *  2. 메소드의 반환형(return type)이 동일해야 함 (이후 수정사항 있음)
     *  3. 매개변수의 타입, 갯수, 순서가 동일해야 함 (변수명 상관X)
     *  4. 부모 클래스의 private 메소드는 자식 클래스가 접근이 불가능 -> 오버라이딩 불가능
     *  5. final 키워드가 사용된 메소드 -> 오버라이딩 불가능
     *  6. 접근 제어자 -> 부모 메소드와 같거나 더 넓은 범위여야 함
     *  7. 예외처리는 같은 예외이거나 더 구체적(하위)인 범위의 예외를 처리
    * */

    public Object method2 (int num) {return null;}
    public void method(int num) {}
    private void privateMethod() {}
    public final void finalMethod() {}
    protected void protectedMethod() {}
}
