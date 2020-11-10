package com.springcloud1109.paymentclinet80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentClinet80Application {

	public static void main(String[] args) {
		SpringApplication.run(PaymentClinet80Application.class, args);
	}

}
