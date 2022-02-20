package com.greatlearning.surabi.dao;

import java.util.List;

import com.greatlearning.surabi.domain.CreditCard;

public interface FoodMenuDao extends GenericDao<CreditCard>{

	public List<CreditCard >findAllMenuByResturantID(Long resturantId);
	

}
