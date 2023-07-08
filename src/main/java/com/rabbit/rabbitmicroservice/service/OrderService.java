package com.rabbit.rabbitmicroservice.service;


import com.rabbit.rabbitmicroservice.entities.Orders;

public interface OrderService {
    void saveOrder(Orders orders);
}
