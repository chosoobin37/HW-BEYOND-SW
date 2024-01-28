package com.ohgiraffers.section03.grammar;

public enum UserRole1 {
    Guest,
    Consumer,
    Producer,
    Admin;


    private String name;

    /* 필기.
    *   생성자를 가질 수 있지만, 생성자 -> 외부에서 사용하지 못하도록(싱글톤 패턴) default
    *   private 접근 제어자만 사용 가능
    *   (enum 타입은 고정된 상수들의 집합, 한 번 할당된 객체는 불변)  */
    private UserRole1() {
        System.out.println("기본 생성자 호출 확인");
    }
    
    /* 설명. 필요한 경우 메소드 추가도 가능 (필드명 소문자로 반환하는 기능 추가) */
    public String getNameToLowerCase() {
        return this.name().toLowerCase();
    }

}
