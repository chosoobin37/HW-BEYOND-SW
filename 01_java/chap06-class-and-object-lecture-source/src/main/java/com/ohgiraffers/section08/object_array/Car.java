package com.ohgiraffers.section08.object_array;

public class Car {

    private String moduleName;
    public int maxSpeed;

    public Car() {

    }

    public Car(String moduleName, int maxSpeed) {
        this.moduleName = moduleName;
        this.maxSpeed = maxSpeed;
    }

    public void driveMaxSpeed() {
        System.out.println(moduleName + "차량이 최고 시속 " + maxSpeed + "(km/h)로 달립니다!");
    }
}
