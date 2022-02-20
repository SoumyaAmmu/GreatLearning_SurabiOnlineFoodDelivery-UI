package com.greatlearning.surabi.service;

import java.util.List;

import com.greatlearning.surabi.domain.FoodMenu;


public interface FoodMenuService {
	public void save(FoodMenu foodMenu);
	public FoodMenu update(FoodMenu foodMenu);
	public List<FoodMenu> findAll();
	public FoodMenu findOne(Long id);
	public List<FoodMenu >findAllMenuByResturantID(Long resturantId);
}
