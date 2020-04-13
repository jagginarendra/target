package com.demo.target.controller;

import com.demo.target.model.Order;
import com.demo.target.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchWebController {

    @Autowired
    OrderService orderService;

    private static final Logger logger = LoggerFactory.getLogger(SearchWebController.class);

    @GetMapping("/getOrder")
    public Order getOrder(@RequestParam String orderId) {

        logger.info("OrderId received ===" + orderId);

        return orderService.getOrderById(orderId);

    }
}
