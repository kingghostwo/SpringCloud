package com.hqyj.ClientAccount.modules.account.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.ClientAccount.modules.account.dao.UserDao;
import com.hqyj.ClientAccount.modules.account.entity.City;
import com.hqyj.ClientAccount.modules.account.entity.User;
import com.hqyj.ClientAccount.modules.account.service.TestFeign;
import com.hqyj.ClientAccount.modules.account.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private TestFeign testFeign;

	@Override
	public User getUserByUserId(int userId) {
		User user = userDao.getUserByUserId(userId);
		if (user != null) {
			int countryId = 522;
			List<City> cities = testFeign.getCitiesByCountryId(countryId);
			user.setCities(cities);
		}
		return user;
	}
}
