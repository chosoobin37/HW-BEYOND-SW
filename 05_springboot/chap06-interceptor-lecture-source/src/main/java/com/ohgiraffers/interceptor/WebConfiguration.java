package com.ohgiraffers.interceptor;

import com.ohgiraffers.interceptor.StopwatchInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/* 설명. Interceptor 추가 및 static(정적) resource 호출 경로 등록 설정 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    private StopwatchInterceptor stopwatchInterceptor;

    @Autowired
    public WebConfiguration(StopwatchInterceptor stopwatchInterceptor) {
        this.stopwatchInterceptor = stopwatchInterceptor;
    }

    /* 설명. interceptor를 따로 등록해야 실제로 작동하는 interceptor 처리 */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(stopwatchInterceptor)
                .excludePathPatterns("/css/**");
    }
}
