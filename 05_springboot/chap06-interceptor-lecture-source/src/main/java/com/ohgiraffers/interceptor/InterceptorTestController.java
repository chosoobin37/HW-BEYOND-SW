package com.ohgiraffers.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InterceptorTestController {
    @GetMapping("/stopwatch")
    public String handlerMethod() throws InterruptedException {
        System.out.println("Handler Method 호출 ...");

        Thread.sleep(1000);

        return "result";
    }
}
