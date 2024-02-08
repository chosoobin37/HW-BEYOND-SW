package com.ohgiraffers.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebFilter("/member/*")
public class PasswordEncryptFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("password 암호화 필터의 doFilter() 실행 ...");

        /* 설명. 기존의 request 객체에서 직접 재정의한 request 객체로 변경 */
        RequestWrapper wrapper = new RequestWrapper((HttpServletRequest) servletRequest);

        filterChain.doFilter(wrapper, servletResponse);
    }

}
