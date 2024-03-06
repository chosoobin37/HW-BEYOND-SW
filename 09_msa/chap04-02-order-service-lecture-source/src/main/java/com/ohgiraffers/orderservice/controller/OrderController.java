package com.ohgiraffers.orderservice.controller;

import com.netflix.discovery.converters.Auto;
import com.ohgiraffers.orderservice.dto.OrderDTO;
import com.ohgiraffers.orderservice.service.OrderService;
import com.ohgiraffers.orderservice.vo.ResponseOrder;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders/users/{uesrId}")
    public ResponseEntity<List<ResponseOrder>> getUserOrders(@PathVariable("userId")String userId) {
        List<OrderDTO> orderDTOList = orderService.getUserOrders(userId);
        orderDTOList.stream().forEach(System.out::println);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
