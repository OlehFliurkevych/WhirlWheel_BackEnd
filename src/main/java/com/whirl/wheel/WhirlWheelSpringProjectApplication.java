package com.whirl.wheel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.whirl.wheel.entity.AdminEntity;
import com.whirl.wheel.enumeration.RoleEnum;
import com.whirl.wheel.repository.AdminRepository;

@SpringBootApplication
public class WhirlWheelSpringProjectApplication extends SpringBootServletInitializer{

	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(WhirlWheelSpringProjectApplication.class);
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(WhirlWheelSpringProjectApplication.class, args);
		addAdmin(context);
	}
	
	static void addAdmin(ConfigurableApplicationContext context) {
		String adminName = "admin";
		String adminPassword = "123";
		String adminEmail="oleh0809@gmail.com";
		
		AdminRepository adminRepository = context.getBean(AdminRepository.class);
		AdminEntity entity = adminRepository.findAdminByName(adminName);
		if(entity == null) {
			PasswordEncoder encoder = context.getBean(PasswordEncoder.class);
			entity = new AdminEntity();
			entity.setAdminName(adminName);
			entity.setEmail(adminEmail);
			entity.setPassword(encoder.encode(adminPassword));
			entity.setRole(RoleEnum.ROLE_ADMIN);
			adminRepository.save(entity);
		}
	}
}
