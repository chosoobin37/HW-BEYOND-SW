package com.ohgiraffers.section01.autowired.subsection01.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.print.Book;

public class Application {
    public static void main(String[] args) {

        /* 설명.
         *  AnnotaqtionCongifApplicationContext 생성자에 basPackage 문자열 전달
         *  -> ComponentScan 개념 따로 설정 클래스 없이 바로 적용 가능
        * */
        ApplicationContext context
                = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService bookService = context.getBean("bookService", BookService.class);

        bookService.findAllBook().forEach(System.out::println);

    }
}
