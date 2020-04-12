package com.demo.target.controller;

import com.demo.target.model.Order;
import com.demo.target.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchWebController {

    @Autowired
    OrderService orderService;

    @GetMapping("/getOrder")
    public Order getOrder(@RequestParam String orderId)
    {
        return orderService.getOrderById(orderId);

    }
}
