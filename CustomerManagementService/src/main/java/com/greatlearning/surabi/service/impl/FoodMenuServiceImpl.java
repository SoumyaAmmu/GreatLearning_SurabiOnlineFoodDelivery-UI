package com.greatlearning.surabi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.surabi.dao.FoodMenuDao;
import com.greatlearning.surabi.domain.CreditCard;
import com.greatlearning.surabi.service.FoodMenuService;
@Service
@Transactional 
public class FoodMenuServiceImpl implements FoodMenuService{
	
	@Autowired
    private FoodMenuDao foodMenuDao;

    public void save( CreditCard foodMenu) {  		
    	foodMenuDao.save(foodMenu);
	}
    public CreditCard findByCardHolder(long customerId) {
        return foodMenuDao.findByCardHolder(customerId);
    }
    
    public CreditCard update( CreditCard foodMenu) {  		
		return foodMenuDao.update(foodMenu);
	}
	
  	
	public List<CreditCard> findAll() {
		return (List<CreditCard>)foodMenuDao.findAll();
	}

	
	public CreditCard findOne(Long id) {
		return foodMenuDao.findOne(id);
	}
	public List<CreditCard>findAllMenuByResturantID(Long resturantId) {
		return foodMenuDao.findAllMenuByResturantID(resturantId);
	}
	
	

}
