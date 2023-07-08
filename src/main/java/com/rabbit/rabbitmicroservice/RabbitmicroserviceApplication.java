package com.rabbit.rabbitmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RabbitmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmicroserviceApplication.class, args);
	}

}
