package com.hqyj.ClientTest.modules.test.service;

import java.util.List;

import com.hqyj.ClientTest.modules.test.entity.City;

public interface CityService {

	List<City> getCitiesByCountryId(int countryId);
}
