package com.ohgiraffers.section01.scope.singleton;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product carpBread() {
        return new Bread("붕어빵", 1000, new java.util.Date());
    }

    @Bean
    public Product milk() {
        return new Beverage("딸기우유", 1500, 500);
    }

    @Bean
    public Product water() {
        return new Beverage("삼다수", 3000, 500);
    }

    @Bean       
//    @Scope("singleton")       // Spring Container(IoC Container) -> bean 객체를 기본적으로 singleton으로 관리
    @Scope("prototype")         // bean Scope 수정할 경우 bean 객체의 life cycle을 다른 주기로 가져갈 수 있음
    public ShoppingCart cart() {
        return new ShoppingCart();
    }
}