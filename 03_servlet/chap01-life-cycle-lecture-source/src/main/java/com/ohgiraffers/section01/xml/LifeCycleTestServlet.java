package com.ohgiraffers.section01.xml;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

public class LifeCycleTestServlet extends HttpServlet {
    /* 설명. 기본생성자 */
    public LifeCycleTestServlet() {
        System.out.println("xml 방식 기본 생성자 실행 ...");
    }
    /* 설명. 서블리스이 요청이 최초인 경우 서블릿 객체를 생성하고 자동으로 호출하게 되는 메소드 */
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("servlet 매핑 init() 메소드 호출 ...");
    }
    /* 설명. 컨테이너가 종료될 때 호출하는 메소드 -> 주로 자원 반납용으로 사용 */
    @Override
    public void destroy() {
        System.out.println("servlet 매핑 destroy() 메소드 호출 ...");
    }
    /* 설명. 서블릿 컨테이너에 의해 호출, 최초 요청 시에만 init() 이후에 동작하고,
    *   두번째 요청부터는 바로 service()만 호출 */
    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        System.out.println("xml 매핑 service() 메소드 호출 ...");
        System.out.println("실제로는 이 곳에서 요청 방식에 따라 doGet() or doPost() 실행 ...");
    }

    /* 설명.
     *  서블릿 라이프 사이클: init() -> service() 반복 (doGet() 또는 doPost() 동작) -> destroy()
    * */
}
