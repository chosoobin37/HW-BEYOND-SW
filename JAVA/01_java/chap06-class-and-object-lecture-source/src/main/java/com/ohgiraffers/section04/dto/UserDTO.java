package com.ohgiraffers.section04.dto;

import java.util.Date;

/* 필기.
 *  JavaBean -> JSP에서 배울 표준 액션 태그로 접근할 수 있게 만든 자바 클래스
 *  자바 코드를 모르는 웹 퍼블리셔들도 자바 코드를 사용할 수 있도록 태그 형식으로 지원하는 문법
 *  이때 사용할 수 있도록 규칙을 지정해놓은 java class
 *  지금은 특정 목적에 따라 클래스를 작성하는 규칙
* */

/* 필기.
 *  자바빈 작성 규칙
 *  1. 자바빈이 특정 패키지에 속해 있어야 함 -> default 패키지 사용 금지
 *  2. 필드의 접근 제어자는 private로 선언
 *  3. 기본 생성자가 명시적으로 존재해야 함 -> 매개변수 있는 생성자는 선택사항
 *  4. 모든 필드에 접근 가능한 setter(설정자)와 getter(접근자)rk public으로 작성되어 있어야 함.
 *  5. 직렬화(Serializable 구현) 고려 -> 선택사항
* */

public class UserDTO {          // DataTransportObject

    /* 필기. 1) 필드 (멤버 변수) */
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /* 필기. 2) 생성자 (기본 생성자 필수로 명시적 작성) */
    public UserDTO() {

    }

    public UserDTO(String id, String pwd, String name, Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    /* 필기. 3) 설정자(setter)와 접근자(getter) */
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    /* 설명. 이후 나머지 setter, getter 단축키로 사용 */

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

//    public String forInformation() {
//        return id + ", " + pwd + ", " + name + ", " + enrollDate;
//    }

    /* 필기. 4) 모든 멤버 변수를 String으로 반환하는 toString() */

    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }
}

