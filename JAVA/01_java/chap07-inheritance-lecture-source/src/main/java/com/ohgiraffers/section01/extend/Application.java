package com.ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 상속 이해 */

        /* 필기.
         *  상속은 부모의 멤버를 물려받아 재사용성에 유리하게 만들기 위한 객체지향의 특징이자 문법
         *  단순히 물려받아 재사용하는 개념X, 부모클래스의 개념을 확장(Extend)하는 데 의의
         *  현재 가장 중요한 의미 -> 다형성을 적용하기 위한 문법적 토대
         *  -
         *  장점
         *  1. 새로운 클래스 작성 시 기존에 작성한 클래스 재사용 가능
         *   1-1. 재사용 시 생산성 크게 향상 가능 (생산성 측면)
         *   1-2. 부모 클래스만 수정해도 자식 클래스 전체에 적용 (유지보수 측면)
         *  2. 클래스 간의 게층 관계 형성 -> 다형성의 문법적 토대
         *  -
         *  단점
         *  1. 부모 클래스의 기능을 추가, 변경할 경우 -> 자식 클래스 정상 작동 예측 어려움
         *   -> 경우에 따라 유지보수 악영향
         *  2. 부모 클래스에서 유의미하고 중요했던 기능이 자식 클래서에서는 무의미할 수 있음 (불필요한 멤버 추가)
         *  -
         *  메소드 오버라이딩 (Overriding) -> 메소드 재정의
         *  부모 메소드의 헤드부를 그대로 사용하면서 자식 클래스가 정의한 메소드대로 동작하도록 메소드 바디부(몸체)를 새롭게 재작성
         *  이후 다형성 적용 -> 자식의 오버라이딩 된 메소드가 우선적으로 동작 (동적 바인딩)
         *  -
         *  장점과 단점 고려 시 -> 상속은 오용의 가능성이 있기 때문에 IS-A 관계로 구분되는 경우에만 적절히 사용
         *  IS-A 관계 VS HAS-A 관계
        * */

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
