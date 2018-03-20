package com.whirl.wheel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whirl.wheel.entity.AdminEntity;
import com.whirl.wheel.repository.AdminRepository;
import com.whirl.wheel.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	private AdminRepository adminRepository;
	
	@Autowired
	public AdminServiceImpl(AdminRepository adminRepository) {
		this.adminRepository = adminRepository;
	}

	@Override
	public void saveAdmin(AdminEntity admin) {
		adminRepository.save(admin);
	}

	@Override
	public AdminEntity findAdminById(int id) {
		return adminRepository.findOne(id);
	}

	@Override
	public AdminEntity findAdminByName(String name) {
		return adminRepository.findAdminByName(name);
	}

}
