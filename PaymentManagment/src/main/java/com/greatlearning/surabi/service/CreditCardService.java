package com.greatlearning.surabi.service;

import java.util.List;

import com.greatlearning.surabi.domain.CreditCard;
 
public interface CreditCardService {

	public void save(CreditCard creditCard);
	public CreditCard update(CreditCard creditCard);
	public List<CreditCard> findAll();
	public CreditCard findOne(Long id);
	
}
