package com.springcloud1109.paymentserver8002.controller;


import com.springcloud1109.common.entity.CommonResult;
import com.springcloud1109.common.entity.Payment;
import com.springcloud1109.paymentserver8002.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhouxuqian
 * @create 2020-11-08-22:12
 */
@Slf4j
@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        Integer result = paymentService.create(payment);

        log.info("*****插入结果：" + result);

        if (result > 0) {
            return new CommonResult(200, "插入数据库成功"+serverPort, result);
        } else {
            return new CommonResult(444, "插入数据库失败"+serverPort, null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult create(@PathVariable("id") Integer id) {
        Payment payment = paymentService.getPaymentById(id);

        log.info("*****查询结果：" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询数据库成功"+serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录，查询id：" + id, null);
        }
    }

    @PostMapping(value = "/payment/update/{id}")
    public CommonResult update(@PathVariable("id") Integer id, @RequestBody Payment payment) {
        Integer result = paymentService.updatePayment(payment);

        log.info("*****修改结果：" + result);

        if (result > 0) {
            return new CommonResult(200, "修改数据库成功"+serverPort, result);
        } else {
            return new CommonResult(444, "没有对应记录，查询id：" + id, null);
        }
    }

    @DeleteMapping(value = "/payment/delete/{id}")
    public CommonResult delete(@PathVariable("id") Integer id) {
        Integer result = paymentService.deletePaymentById(id);

        log.info("*****删除结果：" + result);

        if (result > 0) {
            return new CommonResult(200, "删除数据库成功"+serverPort, result);
        } else {
            return new CommonResult(444, "没有对应记录，查询id：" + id, null);
        }
    }
}
