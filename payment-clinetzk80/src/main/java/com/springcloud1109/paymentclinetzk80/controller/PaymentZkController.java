package com.springcloud1109.paymentclinetzk80.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhouxuqian
 * @create 2020-11-10-17:54
 */
@RestController
@Slf4j
public class PaymentZkController {

    public static final String INVOKE_URL="http://payment-zookeeper";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String paymentInfo() {

        String result = restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);

        return result;
    }
}
