package com.ohgiraffers.section01.polymorphism;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 다형성 및 타입 형변환 이해 */

        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();

        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
    }
}
