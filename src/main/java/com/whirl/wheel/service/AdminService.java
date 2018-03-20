package com.whirl.wheel.service;

import com.whirl.wheel.entity.AdminEntity;

public interface AdminService {
	
	void saveAdmin(AdminEntity admin);
	
	AdminEntity findAdminById(int id);
	
	AdminEntity findAdminByName(String name);

}
