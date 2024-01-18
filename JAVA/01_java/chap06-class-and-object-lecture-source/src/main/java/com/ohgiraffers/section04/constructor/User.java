package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class User {
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /* 필기.
     *  생성자 작성 위치 -> 문법상으로 클래스 내부에 필드 선언부 이후, 메소드 선언부 이전 작성 (관례)
    * */
    public User() {
        System.out.println("User 객체 생성 완료");
    }

    /* 필기. 생성자와 같은 클래스 내부에 거의 필수적으로 들어가는 요소를 생성하는 단축키 -> Alt + Insert */
    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public User(String id, String pwd, String name, Date enrollDate) {
        
        /* 필기. 생성자 안의 this. -> 해당 생성자를 통해 생성될 객체 접근하는 것 */ 
        /* 필기. 일반적으로 필드의 변수명과 매개변수명이 동일하므로 반드시 this. 명시 */
        /* 필기. 생성자 안의 this()는 해당 클래스의 다른 생성자를 사용하는 것 */
//        this.id = id;
//        this.pwd = pwd;
//        this.name = name;
//        this()                    // this()를 통한 다른 생성자 활용 -> 다른 하나의 생성자만 활용 가능
        this(id, pwd, name);
        this.enrollDate = enrollDate;
//        this(id, pwd, name);      // this() -> 반드시 먼저 명시되어야 함

        System.out.println("모든 필드를 초기화하는 매개변수 있는 생성자를 통해 User 객체 생성");
    }

    public String forInformation() {
        return this.id + ", " + this.pwd + ", " + this.name + ", " + this.enrollDate;
    }
}
