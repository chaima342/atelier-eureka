package com.example.EurekaTP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableDiscoveryClient

@SpringBootApplication
@EnableEurekaServer
public class EurekaTpApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaTpApplication.class, args);
	}

}
