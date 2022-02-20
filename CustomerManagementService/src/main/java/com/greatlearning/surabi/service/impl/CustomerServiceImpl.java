package com.greatlearning.surabi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.surabi.dao.CustomerDao;
import com.greatlearning.surabi.domain.CreditCard;
import com.greatlearning.surabi.domain.Customer;
import com.greatlearning.surabi.service.CustomerService;

@Service
@Transactional 
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDao customerDao;

	@Override
	public void save(Customer customer) {
		customerDao.save(customer);
	}

	@Override
	public Customer update(Customer customer) {
		return customerDao.update(customer);
	}

	@Override
	public List<Customer> findAll() {
		return (List<Customer>) customerDao.findAll();
	}

	@Override
	public Customer findOne(Long id) {
		return customerDao.findOne(id);
	}

}


