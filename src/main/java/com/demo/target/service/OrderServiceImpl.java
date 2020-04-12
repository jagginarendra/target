package com.demo.target.service;

import com.demo.target.model.Order;

import java.util.Date;

public class OrderServiceImpl implements OrderService {


    @Override
    public Order getOrderById(String orderId) {
        return new Order(orderId,new Date(),5000,1500);
    }
}
