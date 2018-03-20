package com.whirl.wheel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="admin",indexes=@Index(columnList="admin_name"))
@Entity
public class AdminEntity extends BaseEntity{

	@Column(name="admin_name")
	private String adminName;
	
	private String email;
	
	private int password;
	
	
}
