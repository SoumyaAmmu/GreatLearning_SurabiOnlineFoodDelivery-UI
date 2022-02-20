package com.greatlearning.surabi.service;

import java.util.List;

import com.greatlearning.surabi.domain.Customer;

public interface CustomerService {
	public void save(Customer customer);
	public Customer update(Customer customer);
	public List<Customer> findAll();
	public Customer findOne(Long id);

}
