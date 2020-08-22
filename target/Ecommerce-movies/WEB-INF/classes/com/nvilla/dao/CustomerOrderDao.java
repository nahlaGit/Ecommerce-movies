package com.touhid.onlineshop.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nvilla.model.Cart;
import com.nvilla.model.CustomerOrder;

@Repository

public interface CustomerOrderDao extends CrudRepository<CustomerOrder, Long>{

	CustomerOrder getCustomerOrderBycart(Cart cart);
}
