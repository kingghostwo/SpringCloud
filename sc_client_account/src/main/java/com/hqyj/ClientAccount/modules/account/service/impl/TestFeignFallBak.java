package com.hqyj.ClientAccount.modules.account.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hqyj.ClientAccount.modules.account.entity.City;
import com.hqyj.ClientAccount.modules.account.service.TestFeign;

@Component
public class TestFeignFallBak implements TestFeign {

	@Override
	public List<City> getCitiesByCountryId(int countryId) {
		return new ArrayList<City>();
	}

}
