package com.ohgiraffers.section01.user_type;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /* 수업목표. 클래스 이해 및 작성 */
        /* 설명.    
         *  회원정보 관리 위해 회원의 다양한 정보 취급 및 관리 -> 아이디, 비밀번호, 이름, 나이, 성별, 취미
        * */

        /* 목차. 1) 변수를 이용한 데이터 관리 */
//        String id = "user01";
//        String pwd = "pass01";
//        String name = "홍길동";
//        int age = 20;
//        char gender = '남';
//        String[] hobby = new String[]{"축구", "볼링", "테니스"};
//
//        System.out.println("id: " + id);
//        System.out.println("pwd: " + pwd);
//        System.out.println("name: " + name);
//        System.out.println("age: " + age);
//        System.out.println("gender: " + gender);
//        System.out.println("hobby: " + Arrays.toString(hobby));
        
        /* 필기.
         *  변수들로만 관리할 때 발생하는 문제점 
         *  1. 많은 변수명 관리하기 어려움
         *  2. 메소드의 전달인자로 전달할 값이 너무 많아 회원과 관련된 기능 호출 시 매개변수 증가
         *  3. 메소드의 반환형으로 회원이라는 개념을 반환할 수 X (메소드의 반환형은 하나여야 하기 때문)         *
        * */

        Member member = new Member();
        Member member2 = new Member();

        System.out.println(member.name);
        System.out.println(member2.name);

        member.name = "김철수";
        member2.name = "김영희";

        System.out.println(member.name);
        System.out.println(member2.name);

        /* 설명. 김철수만 완성 */
        member.age=30;
        member.gender = '남';
        member.hobby = new String[]{"볼링", "하키"};
        member.id = "user03";
        member.pwd = "pwd03";
        
        /* 설명. 회원 정보를 하나의 전달인자로 전달하고 하나의 매개변수 받을 수 있다. */ 
        /* 설명. 또한 메소드의 반환형으로 한 번에 회원정보를 반환할 수 있고, 반환 받3은 곳에서 반환된 객체에 접근 가능 */ 

        System.out.println(printMember(member).name);

        Member renameMember = printMember(member);
        System.out.println(renameMember.age);
        System.out.println(Arrays.toString(renameMember.hobby));
    }
    private static Member printMember(Member member) {
        System.out.println("개명을 시작합니다.");
        member.name = "박길동";

        return member;
    }
}
