package com.greatlearning.surabi.dao;



import java.util.List;

import com.greatlearning.surabi.domain.Order;

public interface OrderDao extends GenericDao<Order> {

	public List<Order> findOneByUserId(Long id);
	public List<Order> findAllSubSelect();
}
