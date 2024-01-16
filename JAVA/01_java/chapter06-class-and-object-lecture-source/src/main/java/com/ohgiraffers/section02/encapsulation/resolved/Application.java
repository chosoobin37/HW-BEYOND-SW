package com.ohgiraffers.section02.encapsulation.resolved;

public class Application {
    /* 필기.
     *  객체지향프로그래밍(OOP) -> Object Oriented Programming Language
     *  추상화, 캡슐화, 상속, 다형성을 적용하여 유지보수성을 고려한 응집력 높고 결합도 낮은 객체 위주의 개발 방식을 적용한 프로그래밍
     * 
     *  필기. 객체지향의 4대 특징
     *    1. 추상화 (제외하면 3대 특징) -> Abstraction
     *    2. 캡슐화 (정보은닉 -> 필드 및 메소드 은닉, 타입 은닉, 구현 은닉) -> Encapsulation
     *    3. 상속 -> Inheritance
     *    4. 다형성 -< polymorphism
    * */
    public static void main(String[] args) {
        /* 수업목표. 접근제어자와 캡슐화에 대한 이해 및 직접 밀드 접근을 막는 이유 이해 */
        Monster monster = new Monster();
        monster.name = "드라큘라";
        monster.hp = 1000;

        /* 필기.     
         *  캡슐화 -> 유지보수를 증가시키기 위해 필드의 직접적인 접근 제한
         *  public 메소드를 이용해서 간접적으로(우회) 접근하여 사용할 수 있도록 하는 기술
         *  클래스 작성 시 특별한 목적이 없는 한 캡슐화를 적용하는 것이 기본 원칙
        * */

        /* 설명. 필드에 직접 접근 대신 메소드를 통해 우회 접근 */
        monster.setInfo1("드라큘라");
        monster.setInfo2(1000);
        
    }
}
