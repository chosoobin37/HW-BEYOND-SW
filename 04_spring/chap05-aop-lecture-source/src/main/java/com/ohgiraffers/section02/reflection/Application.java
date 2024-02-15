package com.ohgiraffers.section02.reflection;

import java.lang.reflect.*;

public class Application {

    public static void main(String[] args) {

        /* 필기.
         *  reflection -> 컴파일 된 자바 코드에서 역으로 클래스를 불러 메소드 및 필드 정보를 구해오는 방법
         *  스프링 프레임워크, 마이바티스, 하이버네이트, jackson 등의 라이브러이에서 사용
         *  스프링에서는 런타임 시 개발자가 등록한 빈을 애플리케이션 내에서 사용할 수 있가 하는 기술
         *  -
         *  reflection -> 강력한 도구이지만 무분별하게 사용해서는 X
         *  1) 오버헤드 발생 -> 성능 저하 발생 가능성 있기 때문에 민감한 어플리케이션에서는 사용 X
         *  2) 캡슐화 저해 -> private로 설정한 member 또는 필드에 접근 가능하기 때문에 코드기능 저하 및 문제 야기 가능
        * */

        /* 설명. 1. Class 타입의 Class 메타정보 추출 */
        Class class1 = Account.class;
        System.out.println("class1 = " + class1);

        Class class2 = new Account().getClass();
        System.out.println("class2 = " + class2);

        try {
            Class class3 = Class.forName("com.ohgiraffers.section02.reflection.Account");
            System.out.println("class3 = " + class3);

            Class class4 = Class.forName("[D");
            Class class5 = double[].class;

            System.out.println("class4 = " + class4);
            System.out.println("class5 = " + class5);

            Class class6 = Class.forName("[Ljava.lang.String;");
            Class class7 = String[].class;

            System.out.println("class6 = " + class6);
            System.out.println("class7 = " + class7);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("=====================필드 정보===========================");

        /* 설명. 2. 필드 정보 추출 */
        Field[] fields = Account.class.getDeclaredFields();
        System.out.println("fields = " + fields);
        for (Field field : fields) {
            System.out.println("modifiers: " + Modifier.toString(field.getModifiers())
                    + ", type" + field.getType()
                    + ", name" + field.getName());
        }
        System.out.println("===================생성자 정보============================");

        /* 설명. 3. 생성자 정보 추출 */
        Constructor[] constructors = Account.class.getConstructors();       // 생성자들이 배열로 담김
        for (Constructor constructor : constructors) {
            System.out.println("name: " + constructor.getName());

            Class[] params = constructor.getParameterTypes();
            for (Class param : params) {
                System.out.println("paramType: " + param.getTypeName());
            }
        }

        try {
            Account acc = (Account) constructors[0].newInstance("20", "110-223-123456", "1234", 10000);     // 선언한 순서 반대로 쌓임
            System.out.println(acc.getBalance());
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        System.out.println("===================메소드 정보===========================");

        /* 설명. 4. 메소드 정보 추출 */
        Method[] methods = Account.class.getMethods();
        Method getBalanceMethod = null;
        for (Method method : methods) {
            System.out.println(Modifier.toString(method.getModifiers())
                    + " " + method.getReturnType().getSimpleName() + " "
                    + method.getName());

            if ("getBalance".equals(method.getName())) {
                getBalanceMethod = method;
            }
        }

        try {
            System.out.println(getBalanceMethod.invoke(((Account)constructors[2].newInstance())));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }

    }

}