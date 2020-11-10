package com.springcloud1109.paymentserver8004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentServer8004Application {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServer8004Application.class, args);
	}

}
