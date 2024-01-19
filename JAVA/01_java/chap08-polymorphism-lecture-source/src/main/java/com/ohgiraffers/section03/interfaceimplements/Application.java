package com.ohgiraffers.section03.interfaceimplements;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. interface 이해 */
        /* 필기.
         *  interface -> 자바의 클래스와 유사한 형태지만 추상메소드(public abstract)와
         *  상수 필드 (public static final)만 가질 수 있는 클래스의 변형체
        * */

        /* 설명. 추상클래스의 인터페이스 차이 -> 면접 단골 질문 (잘 정리해둘 것) */

//        InterProduct ip =new InterProduct();        // 생성자 없어서 안 됨
        InterProduct ip2 = new Product();             // but 타입으로는 활용이 가능 (다형성 가능) (타입 은닉)
        }

        /* 필기.
         *  정보은닉 for 유지보수
         *  1) 필드, 메소드 은닉 -> 캡슐화
         *  2) 타입 은닉 -> 다형성
         *  3) 구현 은닉 -> 다형성, 오버라이딩
        * */
    }
