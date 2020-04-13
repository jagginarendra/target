package com.demo.target.service;

import com.demo.target.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class OrderServiceImpl implements OrderService {


    private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Override
    public Order getOrderById(String orderId) {

        logger.info("returning order details for {}",orderId);
        return new Order(orderId,new Date(),5000,1500);
    }
}
