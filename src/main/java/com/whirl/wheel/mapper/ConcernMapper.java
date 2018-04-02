package com.whirl.wheel.mapper;

import com.whirl.wheel.domain.ConcernRequest;
import com.whirl.wheel.domain.ImageRequest;
import com.whirl.wheel.entity.ConcernEntity;

public interface ConcernMapper {

	public static ConcernEntity concernToEntity(ImageRequest image,ConcernRequest concern) {
		ConcernEntity entity=new ConcernEntity();
		entity.setCountry(concern.getCountry());
		entity.setImagePath("/concern/"+concern.getDescription());
		entity.setTitleConcern(concern.getTitle());
		entity.setId(concern.getId());
		entity.setCreatedAt(concern.getCreatedAt());
		entity.setDescription(concern.getDescription());
		return entity;
	}
}
