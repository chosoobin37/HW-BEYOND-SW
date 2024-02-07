package com.ohgiraffers.section02.otherservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /* 설명. redirect 이후 오는 서블릿은 기존과 다른 새로운 request와 response 객체로 오게 됨 */
        System.out.println("redirect 이후 request의 attribute: " + req.getAttribute("test"));   // null

        /* 설명. 파라미터가 넘어오면 request 객체가 달라져도 값 전달 */
        System.out.println("redirect 이후 request의 parameter: " + req.getParameter("test"));

        /* 설명.
         *  redirect -> request의 attribute 개념으로 다른 서블릿에게 값(상태) 전달 불가능
         *  다음 서블릿으로 클라이언트가 새로 요청하면 기존의 request와 response 객체가 아닌
         *  새로운 request나 response 객체가 만들어지며 요청하기 때문
         *  -
         *  cookie나 session 같은 공간을 활용하는 방법을 사용해서 값 공유 가능
        * */

        /* 설명.
         *  forward vs redirect
         *  request나 response 객체를 유지하여 요청 처리를 하고 싶은 경우 forwarding 사용
         *  클라이언트(브라우저)가 새로고침을 할 때마다 처음 요청하는 서블릿을 재호출하게 하고 싶지 않다면 (ex) insert
         *  redirect 사용
         *  -
         *  foward -> request나 attribute 활용하여 다음 서블릿으로 값 넘기기 가능
         *  redirect -> 퀴리스트링 형태로 parameter 개념 활용하여 다음 서블릿으로 값 넘기기 가능
        * */
    }
}
