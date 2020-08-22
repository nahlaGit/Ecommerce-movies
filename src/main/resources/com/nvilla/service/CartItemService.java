package com.nvilla.service;

import java.util.List;

import com.nvilla.model.Cart;
import com.nvilla.model.CartItem;

public interface CartItemService {

	public void addCartItem(CartItem cartItem);
	
	public void deleteCartItem(CartItem cartItem);
	
	
	public void removeAllCartItems(Cart cart);
	
	CartItem getCartItemByProduct(long productId);
	List<CartItem> findAllCartItemsBycart(Cart cart);
}
