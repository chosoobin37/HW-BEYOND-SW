package com.ohgiraffers.section02.abstractclass;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 추상클래스 및 추상메소드 이해 */

        /* 필기.
         *  추상클래스와 추상메소드
         *  추상메소드를 0개 이상 포함하는 클래스 -> 추상 클래스
         *  쉽게 말해 불완전한 클래스
         *  불완전한 클래스 -> 생성자를 통해 객체 생성 못함
         *  단, 자식 클래스가 객체가 생성될 때 내부적으로 생성 가능
         *  -
         *  메소드의 헤드부만 있고 바디부가 없는 메소드 -> 추상메소드
         *  쉽게 말해 불완전한 메소드
         *  불완전한 메소드를 하나라도 가진 클래스 -> 반드시 추상 클래스
         *  ex) public abstract void method();
        * */
//        Smartphone smartphone=new Smartphone();
//        Product product = new Product();

        /* 설명. abstract 클래스 -> 객체 생성 불가능한 불완전한 클래스 */

        /* 설명. abstract 메소드를 구현한 온전한 자식 클래스 -> 인스턴스(객체) 생성 가능 */
        Smartphone smartphone = new Smartphone();

        Product product = new Smartphone();         // 다형성 적용
        product.abstractMethod();                   // 동적 바인딩에 의한 자식 클래스의 오버라이딩 메소드 실행
        
    }
}
