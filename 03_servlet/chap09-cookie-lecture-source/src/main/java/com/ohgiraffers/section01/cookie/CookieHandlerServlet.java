package com.ohgiraffers.section01.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/cookie")
public class CookieHandlerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        /* 설명.
         *  Cookie(클라이언트의 브라우저에 저장) 생성 및 사용 방법
         *  1) 쿠키 인스턴스 생성
         *  2) 해당 쿠키의 만료시간 설정
         *  3) 응답 헤더 (response header)에 쿠키 담기
         *  4) 응답
        * */

        Cookie firstNameCookie = new Cookie("firstName", firstName);
        Cookie lastNameCookie = new Cookie("lastName", lastName);

        firstNameCookie.setMaxAge(60 * 60 * 24);    // 만료시간 24시간 설정 (초단위)
        lastNameCookie.setMaxAge(60 * 60 * 12);    // 만료시간 12시간 설정 (초단위)

        resp.addCookie(firstNameCookie);
        resp.addCookie(lastNameCookie);

        resp.sendRedirect("redirect");

    }
}
