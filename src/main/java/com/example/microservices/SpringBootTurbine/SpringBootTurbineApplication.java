package com.example.microservices.SpringBootTurbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
@EnableDiscoveryClient
@EnableHystrixDashboard
public class SpringBootTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTurbineApplication.class, args);
	}

}
