package com.zs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RatingRegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingRegistryServiceApplication.class, args);
	}

}
