package com.springcloud1109.paymentserver8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentServer8001Application {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServer8001Application.class, args);
	}

}
