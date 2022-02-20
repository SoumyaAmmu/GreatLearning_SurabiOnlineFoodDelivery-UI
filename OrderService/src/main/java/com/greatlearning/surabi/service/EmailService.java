package com.greatlearning.surabi.service;

import java.util.Locale;

import javax.mail.MessagingException;

import com.greatlearning.surabi.domain.Order;

public interface EmailService {
	public void sendOrderReceivedMail(final String recipientName, final String recipientEmail, Order order,
			 final Locale locale) throws MessagingException ;

}
