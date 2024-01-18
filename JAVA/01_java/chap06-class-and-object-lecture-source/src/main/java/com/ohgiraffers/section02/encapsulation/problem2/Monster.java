package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {
//    String name;
//    int hp;

    /* 설명. 필드의 변수명이 바뀐 경우  */
    String kinds;
    int mp;

    // 단일책임의 원칙 -> 유지보수 용이
    void setInfo1(String info1) {
//        this.name = info1;
        this.kinds = info1;
    }

    void setInfo2(int info2) {
//        this.hp = info2;
        this.mp = info2;
    }
}
