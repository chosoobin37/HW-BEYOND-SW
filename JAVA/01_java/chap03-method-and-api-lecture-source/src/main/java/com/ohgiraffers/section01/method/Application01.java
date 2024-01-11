package com.ohgiraffers.section01.method;

public class Application01 {
    public static void main(String[] args) {
        /* 수업목표. 메소드의 호출 흐름에 대해 이해 */
        /* 필기.
         *  메소드(method) -> 특정 작업을 수행하기 위한 명령문의 집합
         * */
        System.out.println("main() 시작");
        methodA();
        System.out.println("main() 종료");
    }

    public static void methodA() {          // 단순하게 호출할 경우 static 필수
        System.out.println("methodA() 시작");
        methodB();
        System.out.println("methodA() 종료");

    }

    public static void methodB() {
        System.out.println("methodB() 시작");
        methodC();
        System.out.println("methodB() 종료");
    }

    public static void methodC() {
        System.out.println("methodC() 시작");
        System.out.println("methodC() 종료");
    }
}
