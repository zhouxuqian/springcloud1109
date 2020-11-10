package com.springcloud1109.ribbonclientserver80;

import com.springcloud1109.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(value = "cloud-payment-service",configuration = MySelfRule.class)
public class RibbonclientServer80Application {

	public static void main(String[] args) {
		SpringApplication.run(RibbonclientServer80Application.class, args);
	}

}
