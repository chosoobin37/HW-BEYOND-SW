package com.ohgiraffers.section01.extend;

import javax.crypto.spec.PSource;

public class Car {
    /* 설명. 자동차의 속성 및 기능 나열 */

    private boolean runningStatus;

    public Car() {
        System.out.println("Car 클래스의 기본 생성자 호출 ...");
    }

    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달리기 시작합니다.");
    }

    public void soundHorn() {
        if(isRunning()) {
            System.out.println("빵 !! 빵 !!");
        } else {
            System.out.println("주행 중일 때만 경적을 울릴 수 있습니다.");
        }
    }

    public boolean isRunning() {
        return runningStatus;
    }

    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }

}
