package com.ohgiraffers.userservice.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurity {

    /* 설명. 인가(Authorization) method */
    @Bean
    protected SecurityFilterChain configure(HttpSecurity http) throws Exception {

        /* 설명. JWT 로그인 처리 -> csrf 신경 쓸 필요X */
        http.csrf((csrf -> csrf.disable()));

        http.authorizeHttpRequests((auth) -> auth
                .requestMatchers(new AntPathRequestMatcher("/users/**")).permitAll()
        );

        return http.build();
    }

    /* 설명. 인증(Authentication) method */
}
