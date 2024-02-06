package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {
    @Override
    public void run() {
        System.out.println("레이싱 카 경주 시작. 쌩 ~");
    }
    @Override
    public void soundHorn() {
        System.out.println("레이싱 모드에는 경적 기능이 없습니다.");
    }
}
