package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RoutingDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(RoutingDemo1Application.class, args);
	}

}