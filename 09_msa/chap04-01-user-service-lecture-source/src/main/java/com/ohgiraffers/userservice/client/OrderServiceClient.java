package com.ohgiraffers.userservice.client;

import com.ohgiraffers.userservice.vo.ResponseOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/* 설명.
 *  FeignClient -> 마이크로 서비스의 이름(유레카 서버에 뜨는 이름이자 spring.application.name에 해당하는 이름)으로 통신하는 방식
 *  어노테이션의 url -> gateway의 주소 작성, name은 마이크로 서비스의 이름 작성
 * */
@FeignClient(name = "swcamp-order-service", url = "localhost:8080")
public interface OrderServiceClient {

    /* 설명. gateway가 알고 있는 마이크로 서비스의 접두사(라우팅 시 설정한 요청 경로)를 추가해서 요청경로 작성 */
    @GetMapping("/order-service/orders/users/{userId}")
    List<ResponseOrder> getUserOrders(@PathVariable("userId") String userId);
}
