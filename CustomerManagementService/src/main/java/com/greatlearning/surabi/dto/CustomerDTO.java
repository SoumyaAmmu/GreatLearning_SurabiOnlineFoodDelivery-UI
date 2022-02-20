package com.greatlearning.surabi.dto;

import com.greatlearning.surabi.domain.Address;
import com.greatlearning.surabi.domain.CreditCard;
import com.greatlearning.surabi.domain.Customer;

public class CustomerDTO {

	private Customer customer;
	private Address address;
	private CreditCard creditCard;
	
	public CustomerDTO() {
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public CreditCard getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
}
