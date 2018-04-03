package com.whirl.wheel.mapper;

import com.whirl.wheel.domain.ConcernRequest;
import com.whirl.wheel.domain.ImageRequest;
import com.whirl.wheel.entity.ConcernEntity;
import com.whirl.wheel.service.ConcernService;

public interface ConcernMapper {

	public static ConcernEntity concernToEntity(ImageRequest image,ConcernRequest concern) {
		ConcernEntity entity=new ConcernEntity();
		ConcernService concernService;
		entity.setCountry(concern.getCountry());
		entity.setTitleConcern(concern.getTitle());
		entity.setId(concern.getId());
		entity.setCreatedAt(concern.getCreatedAt());
		entity.setDescription(concern.getDescription());
		return entity;
	}
}
