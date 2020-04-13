package com.demo.target.service;

import com.demo.target.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.Random;

public class OrderServiceImpl implements OrderService {


    private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Override
    public Order getOrderById(String orderId) {

        logger.info("returning order details for {}", orderId);

        Random random = new Random();
        int totalAmount = 0;

        while (true) {
            int amount = random.nextInt(20000);
            if (amount > 10000) {
                totalAmount = amount;
                break;
            }
        }
        int totalTax = totalAmount / 4;

        return new Order(orderId, new Date(), totalAmount, totalTax);
    }
}
