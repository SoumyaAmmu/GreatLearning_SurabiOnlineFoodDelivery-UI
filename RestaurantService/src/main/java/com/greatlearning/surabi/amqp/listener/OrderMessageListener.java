package com.greatlearning.surabi.amqp.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.greatlearning.surabi.domain.Order;
import com.greatlearning.surabi.domain.Order.OrderStatus;
import com.greatlearning.surabi.service.OrderServiceAmqp;

@Component
public class OrderMessageListener {
	@Autowired
	private OrderServiceAmqp orderServiceAmqp;

	public void listenOrderMessage(Order order) {

		/*
		 * first get order status If the order status is Paid , get customer delivery
		 * address From customer micro-services and update orderStatus into finished 
		 * send Message to Order micro-services with updated order status
		 * 
		 */
		
		System.out.println("inside the listenier ............." + order.getRestaurantName() + order.getTotalPrice()
				+ order.getUserName() + order.getOrderStatus());



		if (order.getOrderStatus() == OrderStatus.Paid) 
		 order.setOrderStatus(OrderStatus.Finished);

		orderServiceAmqp.publish(order);


	}

}
