package com.ohgiraffers.section04.dto;

import com.ohgiraffers.section04.constructor.User;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 생성자를 이용한 객체 초기화와 설정자를 이용한 초기화의 장단점 이해 */
        UserDTO user1 = new UserDTO();
//        System.out.println(user1.forInformation());
        user1.setId("user01");
        System.out.println(user1.getId());
//        System.out.println(user1.forInformation());

    }
}