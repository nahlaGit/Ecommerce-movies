package com.nvilla.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nvilla.model.CustomerContact;

public interface CustomerContactService {

	public void addNewMessage(CustomerContact customerContact);
	
	public void deleteMessageById(long customerContactId);
	
	public List<CustomerContact> getAllCustomerContact();
	
	
	Page<CustomerContact> getAllCustomerMessage(Integer pageNumber);
	
}
