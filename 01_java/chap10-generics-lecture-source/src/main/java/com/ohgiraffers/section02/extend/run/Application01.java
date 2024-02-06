package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.vo.*;

public class Application01 {

    /* 수업목표. extends 키워들 사용하여 특정 타입만 제네릭으로 사용하도록 제한 */
    /* 설명. Rabbit이거나 Rabbit의 자식 타입이 아닌 타입 -> generic 지정시 컴파일 에러 발생 */
    public static void main(String[] args) {

//        RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
//        RabbitFarm<Snake> farm2 = new RabbitFarm<Snake>();
//        RabbitFarm<Mammal> farm3 = new RabbitFarm<Mammal>();

        /* 설명. Rabbit 또는 Rabbit의 자식 타입으로는 인스턴스 생성 가능 */
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry();
        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry();        // 동적 바인딩에 의해 반환형이 Animal의 cry()가 아닌 Bunny의 cry() 실행

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();

    }
}
