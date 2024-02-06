package com.ohgiraffers.section02.looping;

public class Application {
    public static void main(String[] args) {
        A_for aClass = new A_for();

        /* 필기. 단독 for문 흐름 확인용 메소드 호출 */
//        aClass.testSimpleForStatement();

        /* 필기. 반복문을 사용하는 예제 -> 반복문 필요성 */
//        aClass.testForExample1();
//        aClass.testForExample2();

        /* 필기. 중첩 반복문 사용 예제 */
        B_nestedFor bClass = new B_nestedFor();
//        bClass.printGugudanFromTwoToNine();
//        bClass.printUpgradeGugudanFromTwoToNine();          // 좋은 코드 -> 가독성 좋고 유지보수 용이, 중복 코드 최소화
                                                            // 1 메소드 1 기능
        /* 필기. 중첩 반복문을 활용한 별찍기 예제 */
//        bClass.printStars();

        C_while cClass = new C_while();

        /* 필기. 단독 while문 흐름 확인용 메소드 호출 */
//        cClass.testSimpleWhileStatement();

        /* 필기. while문 사용 예제*/
//        cClass.testWhileExample();

        D_doWhile dClass = new D_doWhile();

        /* 필기. do-while문 흐름 확인용 메소드 호출 */
//        dClass.TestSimpleDoWhileStatement();

        /* 필기. do-while문 사용 예제*/
        dClass.TestDoWhileExample();

    }
}
