package com.pk.springkubernetes.controllers;

import com.pk.springkubernetes.models.Order;
import com.pk.springkubernetes.repositories.OrderRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    public OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @PostMapping("/order")
    public Order postOrder(@RequestBody Order order){
        return  orderRepository.save(order);

    }
}
