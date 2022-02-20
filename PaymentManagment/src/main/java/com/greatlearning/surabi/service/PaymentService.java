package com.greatlearning.surabi.service;

import java.util.List;

import com.greatlearning.surabi.domain.CreditCard;
import com.greatlearning.surabi.domain.Payment;

public interface PaymentService {
	public void save(Payment payment);
	public Payment update(Payment payment);
	public List<Payment> findAll();
	public Payment findOne(Long id);
	public void publish(Payment payment);
	boolean checkCard(long customerId);
	
	CreditCard getCard(long customerId);
}
