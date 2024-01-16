package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    String name;
    int hp;

    public void setHP(int hp) {
        this.hp = hp;
        // this -> 메소드 호출 당시의 Monster 개체 의미, this.hp -> 해당 객체의 hp공간 의미
        // 상황에 따라 this는 매번 달라짐

    }
}
