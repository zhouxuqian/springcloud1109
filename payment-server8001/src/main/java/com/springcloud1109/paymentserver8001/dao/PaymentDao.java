package com.springcloud1109.paymentserver8001.dao;

import com.springcloud1109.common.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhouxuqian
 * @create 2020-11-08-22:06
 */
@Mapper
public interface PaymentDao {
    public Integer create(Payment payment);

    public Payment getPaymentById(@Param("id") Integer id);

    public Integer updatePayment(Payment payment);

    public Integer deletePaymentById(@Param("id") Integer id);
}
