package com.nvilla.service;

import com.nvilla.model.Users;

public interface UsersService {

	public void addUsers(Users users);
	
	Users findUserByusername(String username);
}
