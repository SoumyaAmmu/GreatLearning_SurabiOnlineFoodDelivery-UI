package com.greatlearning.surabi.dao;

import java.util.List;

import com.greatlearning.surabi.domain.FoodMenu;

public interface FoodMenuDao extends GenericDao<FoodMenu>{

	public List<FoodMenu >findAllMenuByResturantID(Long resturantId);
	

}
