package com.nvilla.service;

import com.nvilla.model.BillingAddress;

public interface BillingAddressService {

	public void addBillingAddress(BillingAddress billingAddress);
	
	BillingAddress getBillingAddressbyId(long billingAddressId);
}
