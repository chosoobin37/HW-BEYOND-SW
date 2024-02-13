package com.ohgiraffers.section03.annotationconfig.subsection01.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/* 설명.
 *  section03 -> ComponentScan과 관련하여 java 클래스와 xml 방식으로 사용하는 방식 확인
 *  이 중에서도 java 클래서와 @ComponentScan 방식 자주 사용
* */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("beanName = " + beanName);
        }
    }
}
