package com.nvilla.service;

import java.io.IOException;

import com.nvilla.model.Cart;

public interface CartService {

	public void addCart(Cart cart);
	
	public Cart getCartById(long cartId);

	Cart validateCustomer(long cartId) throws IOException;
}
