package com.whirl.wheel.service;

import java.util.List;

import com.whirl.wheel.entity.CountryEntity;

public interface CountryService {

	void saveCountry(CountryEntity country);
	
	List<CountryEntity> findAllCountries();
	
	CountryEntity findCountryById(int id);
	
	CountryEntity findCountryByTitle(String title);
	
}
