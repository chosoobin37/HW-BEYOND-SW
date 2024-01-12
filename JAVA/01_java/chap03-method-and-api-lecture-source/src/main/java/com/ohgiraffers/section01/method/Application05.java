package com.ohgiraffers.section01.method;

public class Application05 {
    public static void main(String[] args) {
        /* 수업목표. 메소드 리턴에 대해 이해 */
        System.out.println("main() method 시작");
        Application05 app5 = new Application05();
        app5.testMethod();
        System.out.println("main() method 종료");
    }
    private void testMethod() {             // 반환할 게 없으면 void 작성 필수
        System.out.println("testMethod() 동작 확인");
                                            // return 이후 code 동작X -> compile error
    }
}
