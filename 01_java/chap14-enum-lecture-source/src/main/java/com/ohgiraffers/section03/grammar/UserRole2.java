package com.ohgiraffers.section03.grammar;

public enum UserRole2 {
    Guest("게스트"),
    Consumer("구매자"),
    Producer("판매자"),
    Admin("관리자");

    private final String description;
    
    /* 필기. 
     *  위와 같이 필드를 정의하는 경우 -> 반드시 매개변수 있는 생성자 필요
     *  실제로 매개변수 있는 생성자를 호출하기 때문
     *  enum 상수 필드의 괄호(()) 안에 넣은 값 
     *  -> 해당 생성자 쪽으로 전달, Enum 인스턴스 생성, 생성된 인스턴스 = 싱글톤 객체
    * */

    UserRole2(String description) {
        System.out.println("description=" + description);
        this.description = description;
    }

    /* 설명. 요소들이 가지는 기본 이름, 정수값 외의 값을 부여(필드 추가)하고 외부에서 사용하려 할 시
    *   -> 필드의 getter 추가 가능 */
    public String getDescription() {
        return this.description;
    }
}
