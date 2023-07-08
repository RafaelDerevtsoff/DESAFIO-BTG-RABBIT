package com.rabbit.rabbitmicroservice.repository;


import com.rabbit.rabbitmicroservice.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Orders,Long> {
}
