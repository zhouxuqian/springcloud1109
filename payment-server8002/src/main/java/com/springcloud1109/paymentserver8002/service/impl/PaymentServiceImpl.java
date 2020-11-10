package com.springcloud1109.paymentserver8002.service.impl;


import com.springcloud1109.common.entity.Payment;

import com.springcloud1109.paymentserver8002.dao.PaymentDao;
import com.springcloud1109.paymentserver8002.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhouxuqian
 * @create 2020-11-08-22:11
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;


    @Override
    public Integer create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Integer id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public Integer updatePayment(Payment payment) {
        return paymentDao.updatePayment(payment);
    }

    @Override
    public Integer deletePaymentById(Integer id) {
        return paymentDao.deletePaymentById(id);
    }
}
