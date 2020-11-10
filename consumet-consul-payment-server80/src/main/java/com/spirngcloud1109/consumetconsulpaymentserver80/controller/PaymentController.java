package com.spirngcloud1109.consumetconsulpaymentserver80.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhouxuqian
 * @create 2020-11-10-18:50
 */
@RestController
@Slf4j
public class PaymentController {

    public static final String INVOKE_URL="http://consul-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consul/consumer/payment")
    public String paymentInfo() {

        String result = restTemplate.getForObject(INVOKE_URL+"/consul/provider/payment",String.class);

        return result;
    }
}
