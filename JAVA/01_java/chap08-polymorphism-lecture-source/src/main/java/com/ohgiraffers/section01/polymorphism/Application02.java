package com.ohgiraffers.section01.polymorphism;

import jdk.jfr.TransitionTo;

public class Application02 {
    public static void main(String[] args) {
        
        /* 수업목표. 다향성을 적용하여 객체 배열을 만들어 인스턴스 연속 처리 */
        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }
        for (Animal animal : animals) {
            animal.cry();
            if (animal instanceof Tiger) {
                ((Tiger) animal).bite();
            }
            if (animal instanceof Rabbit) {
                ((Rabbit) animal).jump();
            }
        }
    }
}
