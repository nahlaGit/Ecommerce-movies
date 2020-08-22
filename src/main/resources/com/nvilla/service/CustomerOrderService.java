package com.nvilla.service;

import java.util.List;

import com.nvilla.model.Cart;
import com.nvilla.model.CustomerOrder;

public interface CustomerOrderService {

	public void addCustomerOrder(CustomerOrder customerOrder);

	

	double getCustomerOrderGrandTotal(long cartId);
	
	CustomerOrder getCustomerOrderBycart(Cart cart);
	
	List<CustomerOrder> getAllCustomerOrder();
	
	
	public CustomerOrder getCustomerOrderById(long customerOrderId);
	
	public void deleteCustomerOrderById(long customerOrderId);
	
}
