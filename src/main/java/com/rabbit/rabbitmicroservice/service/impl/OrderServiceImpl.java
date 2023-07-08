package com.rabbit.rabbitmicroservice.service.impl;


import com.rabbit.rabbitmicroservice.entities.Orders;
import com.rabbit.rabbitmicroservice.repository.OrderRepository;
import com.rabbit.rabbitmicroservice.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void saveOrder(Orders order) {
        String functionName = "SAVE-ORDER";
        LOGGER.info("[START-{}] order :{}", functionName, order.toString());
        orderRepository.save(order);
        LOGGER.info("[END-{}]", functionName);
    }


}
