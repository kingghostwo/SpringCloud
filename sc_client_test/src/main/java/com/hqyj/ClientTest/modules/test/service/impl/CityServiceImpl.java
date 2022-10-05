package com.hqyj.ClientTest.modules.test.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.ClientTest.modules.test.dao.CityDao;
import com.hqyj.ClientTest.modules.test.entity.City;
import com.hqyj.ClientTest.modules.test.service.CityService;

@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	private CityDao cityDao;

	@Override
	public List<City> getCitiesByCountryId(int countryId) {
		return Optional.ofNullable(cityDao.getCitiesByCountryId(countryId))
				.orElse(Collections.emptyList());
	}

}
