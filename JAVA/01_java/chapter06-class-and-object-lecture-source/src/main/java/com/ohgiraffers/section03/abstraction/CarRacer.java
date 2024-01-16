package com.ohgiraffers.section03.abstraction;

public class CarRacer {
    /* 설명. 차 한 대(Car 객체 하나)를 필드로 가짐 */
    private Car myCar = new Car();
    public void startUp() {
        this.myCar.startUp();           // this = case1의 racer
    }
    public void stepAccelator() {
        this.myCar.go();
    }
    public void stepBreak() {
        myCar.stop();
    }
    public void turnOff() {
        myCar.turnOff();
    }
}
