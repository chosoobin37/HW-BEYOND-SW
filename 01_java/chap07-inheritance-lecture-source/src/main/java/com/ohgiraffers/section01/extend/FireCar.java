package com.ohgiraffers.section01.extend;

public class FireCar extends Car {      // 상속 받은 후 modify 가능
    public FireCar() {
        super();
        System.out.println("FireCar 클래스의 기본 생성자 호출 ...");
    }

    @Override
    /* 설명.
     *  @Override annotation 추가 이유
     *  1. 메소드 중에 부모로부터 물려받은 메소드 인 것을 한눈에 알아보기 쉽게 (가독성 측면)
     *  2. 부모의 메소드를 오버라이딩할 때 발생할 수 있는 실수 방지 (실수 방지 측면)
    * */
    public void soundHorn() {           // 메소드 재정의 (확장X)
        if(isRunning()) {
            System.out.println("빠아아아앙 !! 빠아아아앙 !!");
        }
    }

    public void sprayWater() {
        System.out.println("화재 현장 발견. 물을 뿌립니다 ========= 3");
    }

}
