package com.demo.target.config;

import com.demo.target.service.OrderService;
import com.demo.target.service.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderAppConfigs {

    @Bean
    public OrderService getOrderService(){
        return new OrderServiceImpl();
    }
}
