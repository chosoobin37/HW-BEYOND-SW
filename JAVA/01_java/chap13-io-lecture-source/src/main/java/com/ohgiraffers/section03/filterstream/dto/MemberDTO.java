package com.ohgiraffers.section03.filterstream.dto;

import java.io.Serializable;

/* 설명. MemberDTO 타입의 객체를 객체단위 입출력(Object 관련 스트림)을 하기 위해서는 Serializable 인터페이스 구현 필요 */

public class MemberDTO implements Serializable {
    private String id;
    private String pwd;
    private String name;
    private String email;
    private int age;
    private char gender;

    public MemberDTO() {

    }
    public MemberDTO(String id, String pwd, String name, String email, int age, char gender) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}
