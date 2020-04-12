package com.demo.target.model;

import java.util.Date;

public class Order {

    private String orderId;

    private Date orderDate;

    private int totalAmount;

    private int totalTax;


    public Order(String orderId, Date orderDate, int totalAmount, int totalTax) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.totalTax = totalTax;
    }

    public String getOrderId() {
        return orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getTotalTax() {
        return totalTax;
    }
}
