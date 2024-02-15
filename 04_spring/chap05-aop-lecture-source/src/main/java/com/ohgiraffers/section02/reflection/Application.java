package com.ohgiraffers.section02.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Application {

    public static void main(String[] args) {
        Class class1 = Account.class;
        System.out.println("class1 =" + class1);

        Class class2 = new Account().getClass();
        System.out.println("class2 =" + class2);

        try {
            Class class3 = Class.forName("com.ohgiraffers.section02.reflection.Account");
            System.out.println("class3 = " + class3);

            Class class4 = Class.forName("[D");
            Class class5 = double[].class;
            System.out.println("class4 = " + class4);
            System.out.println("class5 = " + class5);

            Class class6 = Class.forName("[Ljava.lang.String;");
            Class class7 = double[].class;
            System.out.println("class6 = " + class6);
            System.out.println("class7 = " + class7);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        /* 설명. 2) 필드 정보 추출 */
        Field[] fields = Account.class.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("modifiers: " + Modifier.toString(field.getModifiers())
                    + ", type" + field.getType()
                    + ", name" + field.getName());
        }

        /* 설명. 3) 생성자 정보 추출 */

        /* 설명. 4) 메소드 정보 추출 */ 
    }

}