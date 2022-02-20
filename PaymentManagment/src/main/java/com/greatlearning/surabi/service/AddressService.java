package com.greatlearning.surabi.service;

import java.util.List;

import com.greatlearning.surabi.domain.Address;

public interface AddressService {

	public void save(Address address);
	public Address update(Address address);
	public List<Address> findAll();
	public Address findOne(Long id);
	
}
