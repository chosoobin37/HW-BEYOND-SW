package com.ohgiraffers.section04.assignment.aggergate;

import java.io.Serializable;
import java.util.Arrays;

/* 설명. 객체 입출력의 대상이 되는 클래스이지 엔티티 개념의 클래스 (DB에 저장된 데이터 담거나 넣을 데이터 담을 객체) */
public class Member implements Serializable {

    private int memNo;              // 회원번호
    private String id;              // 회원 ID
    private String pwd;             // 회원 password
    private int age;                // 회원 나이
    private String[] hobbies;       // 회원 취미
    private Blood_Type bloodType;   // 회원 혈액형

    /* 설명. 엔티티 클래스는 setter를 꼭 필요한 것만 생성 */

    public Member(int i, String user01, String pass01, int memNo, String[] strings) {
    }

    public Member(int memNo, String id, String pwd, int age, String[] hobbies, Blood_Type bloodType) {
        this.memNo = memNo;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memNo=" + memNo +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", bloodType=" + bloodType +
                '}';
    }

    public int getMemNo() {
        return memNo;
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public int getAge() {
        return age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public Blood_Type getBloodType() {
        return bloodType;
    }
}
