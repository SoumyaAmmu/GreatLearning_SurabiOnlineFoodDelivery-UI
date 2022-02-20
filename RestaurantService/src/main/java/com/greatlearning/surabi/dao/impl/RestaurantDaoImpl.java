package com.greatlearning.surabi.dao.impl;



import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.greatlearning.surabi.dao.RestaurantDao;
import com.greatlearning.surabi.domain.FoodMenu;
import com.greatlearning.surabi.domain.Restaurant;

@Repository
public class RestaurantDaoImpl extends GenericDaoImpl<Restaurant> implements RestaurantDao {

	public RestaurantDaoImpl() {

		super.setDaoType(Restaurant.class);
	}
	@SuppressWarnings("unchecked")
	public List<FoodMenu>showFoodMenu(Long restaurantId){
		
		Query query = entityManager
				.createQuery("select r.foodMenu from Restaurant  r  " + "where food.RESTAURANT_ID =:resturantId");
		return (List<FoodMenu>) query.setParameter("resturantId", restaurantId).getResultList();

	}
	
}
