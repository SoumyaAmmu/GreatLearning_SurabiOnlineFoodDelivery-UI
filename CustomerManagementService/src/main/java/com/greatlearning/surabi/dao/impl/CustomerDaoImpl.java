package com.greatlearning.surabi.dao.impl;

import org.springframework.stereotype.Repository;

import com.greatlearning.surabi.dao.CustomerDao;
import com.greatlearning.surabi.domain.Customer;

@Repository
public class CustomerDaoImpl extends GenericDaoImpl<Customer> implements CustomerDao{

	public CustomerDaoImpl() {
		super.setDaoType(Customer.class);
	}
	
}
