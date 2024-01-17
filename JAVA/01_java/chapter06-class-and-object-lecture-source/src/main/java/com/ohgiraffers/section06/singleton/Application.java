package com.ohgiraffers.section06.singleton;

import java.util.Calendar;

public class Application {
    public static void main(String[] args) {
        /* 수업목표. 싱글톤 패턴 이해 및 구현 */
        /* 필기.
         *  singleton pattern -> application이 시작될 때 어떤 클래스가 최초 한 번만 메모리에 할당
         *  -> 그 메모리에 인스턴스가 하나만 생성되어 공유되게 하는 것 (메모리 낭비 방지 목적)
         *  장점
         *  1) 첫번째 이용 시에는 인스턴스를 생성해야 하므로 속도차이가 없지만,
         *     두번째 이용 시에는 인스턴스 생성 시간 없이 바로 사용 가능 (재사용)
         *  2) 인스턴스가 절대적으로 한 개만 추구하는 것 보장
         *  단점
         *  1) 싱글톤 인스턴스가 너무 많은 일을 하거나 , 많은 데이터를 공유하면 결합도 상승
         *  2) 동시성 문제 고려해 설계해야 하기 때문에 고난이도
         *
         * 필기.
         *  싱글톤 구현방법
         *  1) 이른 초기화(Eager Initialization) 2) 늦은 초기화(Lazy Initialization)
        * */

        EagerSingleton eager1 = EagerSingleton.getInstance();
//        eager1 = new EagerSingleton();

        LazySingleton lazy1 = LazySingleton.getInstance();
    }

}
