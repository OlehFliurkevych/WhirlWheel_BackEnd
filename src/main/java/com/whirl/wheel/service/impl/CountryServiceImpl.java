package com.whirl.wheel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whirl.wheel.entity.CountryEntity;
import com.whirl.wheel.repository.CountryRepository;
import com.whirl.wheel.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService{

	private CountryRepository countryRepository;
	
	@Autowired
	public CountryServiceImpl(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	@Override
	public void saveCountry(CountryEntity country) {
		countryRepository.save(country);
	}

	@Override
	public List<CountryEntity> findAllCountries() {
		return countryRepository.findAll();
	}

	@Override
	public CountryEntity findCountryById(int id) {
		return countryRepository.findOne(id);
	}

	@Override
	public CountryEntity findCountryByTitle(String title) {
		return countryRepository.findAreaByTitle(title);
	}

	@Override
	public void deleteCountryById(int id) {
		countryRepository.delete(id);
	}

	
}
