package com.ohgiraffers.section01.contextlistener;

import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener, ServletContextAttributeListener {

    public ContextListener() {
        /* 설명. context가 생성될 때 변화를 감지하는 Listener 인스턴스 함께 생성*/ 
        System.out.println("context listener instance 생성 ...");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        /* 설명. context에 attribute가 추가될 때 동작 */ 
        System.out.println("context attribute added ...");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        /* 설명. context에 attribute가 제거될 때 동작 */
        System.out.println("context attribute removed ...");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        /* 설명. context에 attribute가 변경될 때 동작 */
        System.out.println("context attribute replaced ...");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        /* 설명. context에 생성될 때 생성자 호출 이후 동작하는 메소드 */
        System.out.println("context init ...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        /* 설명. context에 소멸될 때 동작하는 메소드 */
        System.out.println("context attribute destroyed ...");
    }
}
