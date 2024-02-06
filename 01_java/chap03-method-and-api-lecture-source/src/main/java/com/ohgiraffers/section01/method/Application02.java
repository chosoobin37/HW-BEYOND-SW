package com.ohgiraffers.section01.method;

public class Application02 {
    public static void main(String[] args) {
        /* 수업목표. 메소드의 호출 흐름에 대해 이해 (main 메소드에서 한 번에 순차적으로 여러 메소드 호출) */
        /* 설명.
         *  static이 붙어 있지 않은 메소드는 <클래스명 변수명 = new.클래스명();> -> 접근연산자(.)도 활용
        * */

        System.out.println("main() 시작");
        Application02 app2 = new Application02();
        app2.methodA();             // static 없이 호출하는 경우
        app2.methodB();
        methodC();
        System.out.println("main() 종료");
    }
    public void methodA() {          // 단순 호출 시 static 없으면 main에서 호출 불가능 (methodA가 안 보임)
        System.out.println("methodA() 시작");
        System.out.println("methodA() 종료");
    }
    public void methodB() {
        System.out.println("methodB() 시작");
        System.out.println("methodB() 종료");
    }
    public static void methodC() {
            System.out.println("methodC() 시작");
            System.out.println("methodC() 종료");
    }
}
