package com.ohgiraffers.orderservice.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.ohgiraffers.orderservice")
public class MyBatisConfiguration {
}
