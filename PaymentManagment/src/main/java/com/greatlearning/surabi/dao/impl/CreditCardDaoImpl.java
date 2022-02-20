package com.greatlearning.surabi.dao.impl;
 
import org.springframework.stereotype.Repository;

import com.greatlearning.surabi.dao.CreditCardDao;
import com.greatlearning.surabi.domain.CreditCard;

@Repository("creditCardDao")
public class CreditCardDaoImpl  extends GenericDaoImpl<CreditCard> implements CreditCardDao {
	public CreditCardDaoImpl() {
		super.setDaoType(CreditCard.class);
	}
}
