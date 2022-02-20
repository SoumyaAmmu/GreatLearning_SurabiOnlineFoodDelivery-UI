package com.greatlearning.surabi.service;



import com.greatlearning.surabi.domain.Order;

public interface OrderServiceAmqp {
	
	public void publish(Order order);

}
