package com.whirl.wheel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.whirl.wheel.entity.AdminEntity;
import com.whirl.wheel.mapper.AdminMapper;
import com.whirl.wheel.repository.AdminRepository;

@Service("adminDetailsService")
public class CustomAdminDetailServiceImpl implements UserDetailsService{

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		AdminEntity admin=adminRepository.findAdminByName(name);
		if(admin==null)throw new UsernameNotFoundException("Admin mot found");
		return AdminMapper.toSecurityAdmin(admin);
	}

}
