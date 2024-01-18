package com.ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 상속 이해 */

        Car car = new Car();

        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        FireCar firecar = new FireCar();
        firecar.soundHorn();
        firecar.run();
        firecar.soundHorn();
        firecar.stop();
        firecar.soundHorn();
        firecar.sprayWater();

        RacingCar racingCar = new RacingCar();
        racingCar.run();
        racingCar.soundHorn();

    }
}
