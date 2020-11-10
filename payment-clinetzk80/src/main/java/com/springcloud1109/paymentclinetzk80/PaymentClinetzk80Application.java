package com.springcloud1109.paymentclinetzk80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentClinetzk80Application {

	public static void main(String[] args) {
		SpringApplication.run(PaymentClinetzk80Application.class, args);
	}

}
