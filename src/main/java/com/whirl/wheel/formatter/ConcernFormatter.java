package com.whirl.wheel.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.whirl.wheel.entity.ConcernEntity;

@Component
public class ConcernFormatter implements Formatter<ConcernEntity>{

	@Override
	public String print(ConcernEntity arg0, Locale arg1) {
		return String.valueOf(arg0.getId());
	}

	@Override
	public ConcernEntity parse(String arg0, Locale arg1) throws ParseException {
		ConcernEntity entity=new ConcernEntity();
		entity.setId(Integer.valueOf(arg0));
		return entity;
	}

}
