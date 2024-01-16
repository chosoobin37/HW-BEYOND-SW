package com.ohgiraffers.section02.encapsulation.resolved;

public class Monster {      // class의 접근 제어자는 public 또는 default(별도 기재X) 두 가지 뿐

    /* 필기. 접근제어자 private를 활용하여 캡슐화 적용 (같은 클래스를 제외한 곳에서 접근 불가) */
    String name;
    int hp;

    void setInfo1(String info1) {
        this.name = info1;
    }
    void setInfo2(int info2) {
        this.hp = info2;
    }
}
