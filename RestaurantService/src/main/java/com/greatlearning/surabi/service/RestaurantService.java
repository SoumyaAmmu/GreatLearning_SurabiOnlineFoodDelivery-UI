package com.greatlearning.surabi.service;

import java.util.List;

import com.greatlearning.surabi.domain.FoodMenu;
import com.greatlearning.surabi.domain.Restaurant;

public interface RestaurantService {
	public void save(Restaurant restaurant);
	public Restaurant update(Restaurant restaurant);
	public List<Restaurant> findAll();
	public Restaurant findOne(Long id);
	public List<FoodMenu>showFoodMenu(Long restaurantId);
}
