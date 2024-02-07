package com.ohgiraffers.section01.forward;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/forward")
public class ReceiveInformationServlet extends HttpServlet {
    public ReceiveInformationServlet() {
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId = req.getParameter("userId");
        String password = req.getParameter("password");

        System.out.println("userId = " + userId);
        System.out.println("password = " + password);
        
        /* 설명. 
         *  이 부분에서는 id와 pwd에 해당하는 user의 정보를 select 하고 확인하는 비즈니스 로직(BL)이 수행
         *  -> 이름을 조회해서 알게 됨
         *  정상적으로 조회 됐다는 가정 하에 "XXX 님 환영합니다."와 같은 메시지 출력 화면 생성 후 응답
        * */
        
        req.setAttribute("userName", "홍길동");

        /* 설명. 화면을 만들어 응답하는 서블릿에게 forward (위임) */
        RequestDispatcher rd = req.getRequestDispatcher("print");
        rd.forward(req, resp);      // print 요청을 받을 수 있는 서블릿 정보를 가지고 만들어짐
        
    }
}
