package com.springcloud1109.providerconsul8006.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author zhouxuqian
 * @create 2020-11-10-18:26
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port")
    private String serverPort;

    @GetMapping("/consul/provider/payment")
    public String paymentConsul(){
        return "springcloud with consul:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
