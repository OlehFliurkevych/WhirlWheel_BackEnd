package com.whirl.wheel.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.whirl.wheel.entity.CountryEntity;

@Component
public class CountryFormatter implements Formatter<CountryEntity>{

	@Override
	public String print(CountryEntity arg0, Locale arg1) {
		// TODO Auto-generated method stub
		return String.valueOf(arg0.getId());
	}

	@Override
	public CountryEntity parse(String arg0, Locale arg1) throws ParseException {
		CountryEntity entity=new CountryEntity();
		entity.setId(Integer.valueOf(arg0));
		return entity;
	}

}
