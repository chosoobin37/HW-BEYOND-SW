package com.ohgiraffers.section03.grammar;

import com.sun.security.jgss.GSSUtil;

import javax.crypto.spec.PSource;
import java.util.EnumSet;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. Enum 문법 이해 및 활용(클래스적 면모) */
        /* 필기.
         *  enum 타입의 필드를 최초 사용 시에만 열거 타입의 인스턴스 -> 한 번만 생성, 이후에는 생성자 호출 X
         *  enum 타입 -> set으로 바꿔 반복시키며 필드들을 한 번에 확인 및 활용 가능
        * */
        UserRole1 admin = UserRole1.Admin;
        System.out.println(admin.toString());
        System.out.println(admin.getNameToLowerCase());

        UserRole2 consumer2 = UserRole2.Consumer;
        System.out.println(consumer2.ordinal() + ", " + consumer2.name() +
                ", " + consumer2.getDescription());

        System.out.println("Set으로 바꿔 반복자를 활용");
        System.out.println("==============================");
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);
        Iterator<UserRole2> iter = roles.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().name());
        }
    }
}
