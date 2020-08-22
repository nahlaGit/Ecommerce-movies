package com.nvilla.service;

import com.nvilla.model.ShippingAddress;

public interface ShippingAddressService {

	public void addShippingAddress(ShippingAddress shippingAddress);
	
	ShippingAddress getShippingAddressById(long shippingAddressId);
}
