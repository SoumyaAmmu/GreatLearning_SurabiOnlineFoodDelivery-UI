package com.greatlearning.surabi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.surabi.dao.AddressDao;
import com.greatlearning.surabi.domain.Address;
import com.greatlearning.surabi.service.AddressService;

@Service
@Transactional 
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressDao addressDao;

	@Override
	public void save(Address address) {
		addressDao.save(address);
	}

	@Override
	public Address update(Address address) {
		return addressDao.update(address);
	}

	@Override
	public List<Address> findAll() {
		return addressDao.findAll();
	}

	@Override
	public Address findOne(Long id) {
		return addressDao.findOne(id);
	}

}
