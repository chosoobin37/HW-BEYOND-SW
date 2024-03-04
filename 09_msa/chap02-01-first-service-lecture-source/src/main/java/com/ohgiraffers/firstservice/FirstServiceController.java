package com.ohgiraffers.firstservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
//@RequestMapping("/first-service")
@RequestMapping("/")
public class FirstServiceController {

    @GetMapping("health_check")
    public String healthCheck(){
        return "I m Ok";
    }

    @GetMapping("message")
    public String message(@RequestHeader("first-request") String header){
        log.info("넘어온 헤더값: {}", header);
        return "First Service Message";
    }
}