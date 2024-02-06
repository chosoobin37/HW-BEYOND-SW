package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal{
    @Override
    public void eat() {
        System.out.println("토끼가 풀을 뜯어먹습니다. ");
    }

    public void run() {
        System.out.println("토끼가 달립니다. 깡총 ~ 깡총 ~ ");
    }

    public void cry() {
        System.out.println("토끼가 울음소리를 냅니다. 끼잉 ~ ");
    }

    public void jump() {
        System.out.println("토끼가 점프합니다. 짬푸 !! 짬푸 !!");
    }
}
