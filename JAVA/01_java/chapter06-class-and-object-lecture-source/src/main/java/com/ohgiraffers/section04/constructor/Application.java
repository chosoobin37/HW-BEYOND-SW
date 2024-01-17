package com.ohgiraffers.section04.constructor;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 생성자 함수 이해와 선언 및 호출 */

        /* 필기.
         *  생성자 -> 인스턴스를 생성할 때 호출하는 반환형이 없는 함수, 기본생성자 or 매개변수 있는 생성자
        * */

        /* 필기. 기본생성자(매개변수 X)를 활용한 객체 생성 */
        User user1 = new User();
        System.out.println(user1.forInformation());

        /* 필기. 매개변수 있는 생성자를 활용한 객체 생성 */
        User user2 = new User("user01", "pass01", "피카츄", new java.util.Date());
        System.out.println(user2.forInformation());
    }
}
    