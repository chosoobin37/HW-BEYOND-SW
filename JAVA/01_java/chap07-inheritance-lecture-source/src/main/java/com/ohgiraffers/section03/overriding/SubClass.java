package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass {
    
    /* 설명. 0) 부모 메소드와 이름, 반환형, 매개변수, 접근제어자 모두 동일 -> 오버라이딩 성립 */
    @Override
    public void method(int num) {}

    /* 설명. 1) 메소드 이름 변경(error) */
//    @Override
//    public void method(int num) {}

    /* 설명. 2) 메소드 리턴 타입 변경(error) */
//    @Override
//    public String method(int num) {return null;}

    /* 설명. 3) 메소드 매개변수 차이나게 변경(error) */
//    @Override
//    public void method(int num, int num2) {}

    /* 설명. 4) 경우에 따라 반환형이 달라도 가능 (부모 메소드 반환형의 자식 타입은 가능) */
    @Override
//    public String method2(int num2) {return null;}
    public Integer method2(int num2) {return null;}

    /* 설명. 5) private 메소드 -> 오버라이딩 불가 */
//    @Override
//    private void privateMethod() {}

    /* 설명. 6) final 메소드 -> 오버라이딩 불가 */
//    @Override
//    private void finalMethod() {}

    /* 설명. 7) 부모 타입과 같은 접근제어자 or 더 넓은 범위의 접근제어자 -> 오버라이딩 가능 */
    @Override
    public void protectedMethod() {}

}
