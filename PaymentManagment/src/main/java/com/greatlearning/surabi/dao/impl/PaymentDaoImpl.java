package com.greatlearning.surabi.dao.impl;

import org.springframework.stereotype.Repository;

import com.greatlearning.surabi.dao.PaymentDao;
import com.greatlearning.surabi.domain.Payment;
@Repository("PaymentDao")
public class PaymentDaoImpl  extends GenericDaoImpl<Payment> implements PaymentDao{
	public PaymentDaoImpl() {
		super.setDaoType(Payment.class);
	}
}
