package com.greatlearning.surabi.dao.impl;

import org.springframework.stereotype.Repository;

import com.greatlearning.surabi.dao.OrderDao;
import com.greatlearning.surabi.domain.Order;

@Repository
public class OrderDaoImpl extends GenericDaoImpl<Order> implements OrderDao {
	public OrderDaoImpl() {
		super.setDaoType(Order.class);
	}
}
