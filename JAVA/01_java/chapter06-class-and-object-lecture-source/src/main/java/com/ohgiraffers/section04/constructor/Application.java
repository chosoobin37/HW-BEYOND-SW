package com.ohgiraffers.section04.constructor;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 생성자 함수 이해와 선언 및 호출 */
        User user1 = new User();
        System.out.println(user1.forInformation());

        User user2 = new User("user01", "pass01", "피카츄", new java.util.Date());
        System.out.println(user2.forInformation());
    }
}
