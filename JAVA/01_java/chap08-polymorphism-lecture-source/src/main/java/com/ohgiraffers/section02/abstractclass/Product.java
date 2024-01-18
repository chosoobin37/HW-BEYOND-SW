package com.ohgiraffers.section02.abstractclass;

public class Product {
    private int nonStaticField;
    private static int staticfield;

    public Product() {

    }

    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod 호출 ...");
    }

    public static void StaticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod 호출 ...");
    }

    public abstract void abstractMethod();
    }
}
