package com.ohgiraffers.section02.uses;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponseWrapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class RequestWrapper extends HttpServletRequestWrapper {
    public RequestWrapper(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String key) {

        /* 설명. 'password'라는 키 값으로 getParameter 사용 시 -> 반환값을 암호화 해서 반환 */
        String value = "";
        if ("password".equals(key)) {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            value = passwordEncoder.encode(super.getParameter("password"));
        } else {            // 그 외 키값 사용시 기존대로 동작
            value = super.getParameter(key);
        }

        return value;
    }
}
