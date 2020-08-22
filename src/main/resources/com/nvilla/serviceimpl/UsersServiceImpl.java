package com.nvilla.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nvilla.dao.UsersDao;
import com.nvilla.model.Users;
import com.nvilla.service.UsersService;

@Service

public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDao usersDao;
	
	@Transactional()
	@Override
	public void addUsers(Users users) {
		
		usersDao.save(users);
		
	}

	@Transactional(readOnly = true)
	@Override
	public Users findUserByusername(String username) {
		
		return usersDao.findUserByusername(username);
	}

}
