package com.micro.limsy.microservices_book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicesBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesBookApplication.class, args);
	}

}
