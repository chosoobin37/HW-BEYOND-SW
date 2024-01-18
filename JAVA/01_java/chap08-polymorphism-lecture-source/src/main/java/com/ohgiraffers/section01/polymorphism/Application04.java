package com.ohgiraffers.section01.polymorphism;

public class Application04 {
    public static void main(String[] args) {

        /* 수업목표. 다형성을 적용하려 리턴타입에 활용 */
        Application04 app4 = new Application04();
        Animal randomAnimal = app4.getRandomAnimal();
        randomAnimal.cry();
    }
    private Animal getRandomAnimal() {
        int random = (int) (Math.random() * 2);       // 0~1까지 난수 생성

        return random == 00 ? new Tiger() : new Rabbit();
    }
}
