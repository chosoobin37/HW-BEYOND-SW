package com.ohgiraffers.firstservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/first-service")
public class FirstServiceController {

    @GetMapping("health_check")
    public String healthCheck() {
        return "I'm OK";
    }

    @GetMapping("message")
    public String message(@RequestHeader("first_request") String header) {
        return "First Service Message";
    }
}
