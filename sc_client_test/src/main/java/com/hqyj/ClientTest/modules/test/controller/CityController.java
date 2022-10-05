package com.hqyj.ClientTest.modules.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hqyj.ClientTest.modules.test.entity.City;
import com.hqyj.ClientTest.modules.test.service.CityService;

@RestController
@RequestMapping("/api")
public class CityController {

	@Autowired
	private CityService cityService;
	@Value("${server.port}")
	private int port;
	
	/**
	 * 127.0.0.1:8761/api/cities/522 ---- get
	 */
	@GetMapping("/cities/{countryId}")
	public List<City> getCitiesByCountryId(@PathVariable int countryId) {
		System.out.println("port: " + port);
		return cityService.getCitiesByCountryId(countryId);
	}
}
