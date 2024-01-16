package com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean isOn = false;
    private int speed;

    public void startUp() {
        if (this.isOn) {                 // 시동이 걸려 있으면
            System.out.println("이미 시동이 걸려있습니다.\n");
        } else {                        // 시동이 걸려 있지 않으면
            this.isOn = true;           // isOn 앞에는 this.이 있는 거지만 this.을 생략해도 자동 입력
            System.out.println("시동을 걸었습니다. 부릉부릉 ~\n");
        }
    }
    public void go() {
        if (isOn) {                     // 시동이 켜져 있어 달릴 수 있음
            System.out.println("현재 차의 시속은 "+speed+"km/h입니다.");
            speed += 10;                // 속도 누적
        } else {                        // 시동이 꺼져 있어 달릴 수 없음
            System.out.println("차에 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
        }
    }
    public void stop() {
        if(isOn) {
            if(speed>0) {
                speed = 0;
                System.out.println("급정거를 하셨습니다. 차를 정지합니다.");
            } else {
                System.out.println("차는 이미 멈춰있는 상태입니다.");
            }
        } else {
            System.out.println("차의 시동이 걸려있지 않습니다. 브레이크를 밟지 마세요.");
        }
    }
    public void turnOff() {
        if(isOn) {
            if(speed>0) {
                System.out.println("달리는 중에는 시동을 끌 수 없습니다. 차를 멈춘 후 시동을 꺼주세요.");
            } else {
                System.out.println("시동을 끄겠습니다. 다시 운행하려면 시동을 켜주세요.");
            }
        } else {
            System.out.println("이미 시동이 꺼져 있습니다. 시동 상태를 다시 확인해주세요.");
        }
    }
}
