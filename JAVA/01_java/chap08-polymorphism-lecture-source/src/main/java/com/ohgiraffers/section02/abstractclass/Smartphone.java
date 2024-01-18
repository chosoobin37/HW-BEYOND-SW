package com.ohgiraffers.section02.abstractclass;

public class Smartphone extends Product{
    public Smartphone() {
        super();
    }

    /* 설명. 추상메소드를 물려받은 자식 클래스(온전한) -> 오버라이딩 필수 (강제성 부여) */
    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스로부터 물려받은 abstractMethod를 오버라이딩한 메소드 호출 ...");
    }

    /* 설명. 추가적인 메소드 작성 가능 */
    public void printSmartPhone() {
        System.out.println("Smartphone 클래스의 printSmartphone 메소드 호출 ...");
    }

}
