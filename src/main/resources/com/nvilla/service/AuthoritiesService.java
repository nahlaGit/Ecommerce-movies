package com.nvilla.service;

import com.nvilla.model.Authorities;

public interface AuthoritiesService {

	public void addAuthorities(Authorities authorities);
	
	Authorities findAuthoritiesByusername(String username);
}
