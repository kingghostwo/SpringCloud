package com.hqyj.ClientAccount.modules.account.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hqyj.ClientAccount.modules.account.entity.City;
import com.hqyj.ClientAccount.modules.account.service.impl.TestFeignFallBak;

@FeignClient(value = "CLIENT-TEST", fallback = TestFeignFallBak.class)
public interface TestFeign {
	
	@GetMapping("/api/cities/{countryId}")
	public List<City> getCitiesByCountryId(@PathVariable int countryId);

}
