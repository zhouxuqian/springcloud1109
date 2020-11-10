package com.spirngcloud1109.consumetconsulpaymentserver80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumetConsulPaymentServer80Application {

	public static void main(String[] args) {
		SpringApplication.run(ConsumetConsulPaymentServer80Application.class, args);
	}

}
