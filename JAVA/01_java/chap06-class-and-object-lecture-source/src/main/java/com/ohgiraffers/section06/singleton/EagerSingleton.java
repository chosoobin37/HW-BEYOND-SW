package com.ohgiraffers.section06.singleton;

import java.util.Locale;

public class EagerSingleton {

    private static EagerSingleton eager = new EagerSingleton();

    public EagerSingleton() {           // 생성자의 접근제어자를 private로 해서 다른 곳에서 객체 생성이 안 되도록 설정

    }

    public static EagerSingleton getInstance() {
        return eager;
    }
}
