package com.whirl.wheel.mapper;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.whirl.wheel.entity.AdminEntity;

public interface AdminMapper {

	public static User toSecurityAdmin(AdminEntity admin) {
		return new User(
				admin.getAdminName(),
				admin.getPassword(),
				AuthorityUtils.createAuthorityList(String.valueOf(admin.getRole())));
	}
}
