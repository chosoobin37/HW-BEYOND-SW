package com.ohgiraffers.section01.polymorphism;

public class Application03 {
    public static void main(String[] args) {
         
        /* 수업목표. 다형성을 적용하여 매개변수에 활용 */

        Application03 app3 = new Application03();
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

//        app3.feed(animal1);
//        app3.feed(animal2);
        app3.feed(new Rabbit());
        app3.feed(new Tiger());
    }

    private void feed(Animal animal1) {
        ((Animal)animal1).eat();
    }
}
