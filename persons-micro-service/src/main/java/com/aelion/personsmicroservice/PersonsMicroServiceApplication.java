package com.aelion.personsmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.aelion.personsmicroservice")
@EnableDiscoveryClient
public class PersonsMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonsMicroServiceApplication.class, args);
	}

}
