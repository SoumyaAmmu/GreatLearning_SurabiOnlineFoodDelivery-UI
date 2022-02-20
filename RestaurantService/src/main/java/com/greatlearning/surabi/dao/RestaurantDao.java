package com.greatlearning.surabi.dao;



import java.util.List;

import com.greatlearning.surabi.domain.FoodMenu;
import com.greatlearning.surabi.domain.Restaurant;

public interface RestaurantDao extends GenericDao<Restaurant> {
	
	public List<FoodMenu>showFoodMenu(Long restaurantId);
}
