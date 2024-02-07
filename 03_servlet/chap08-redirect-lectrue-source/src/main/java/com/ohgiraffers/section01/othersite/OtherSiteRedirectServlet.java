package com.ohgiraffers.section01.othersite;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/othersite")
public class OtherSiteRedirectServlet extends HttpServlet {
    public OtherSiteRedirectServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET 요청을 받으면 Naver 사이트로 redirect");

        /* 설명. redirect는 내 서블릿 객체 뿐만 아니라 외부 사이트로도 연결 가능 */
        resp.sendRedirect("https://www.naver.com/");
    }
}
