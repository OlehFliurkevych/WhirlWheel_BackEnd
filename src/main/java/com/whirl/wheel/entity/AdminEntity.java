package com.whirl.wheel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.whirl.wheel.enumeration.RoleEnum;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter @Getter
@Table(name="admin",indexes=@Index(columnList="admin_name"))
@Entity
public class AdminEntity extends BaseEntity{

	@Column(name="admin_name")
	private String adminName;
	
	private String email;
	
	private String password;
	
	private RoleEnum role;
	
}
