package com.hqyj.ClientTest.modules.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hqyj.ClientTest.modules.test.vo.ConfigBean;

@RestController
@RequestMapping("/api")
public class ConfigBeanController {

	@Autowired
	private ConfigBean configBean;
	
	/**
	 * 127.0.0.1:8761/api/configBean ---- get
	 */
	@GetMapping("/configBean")
	public String getConfigBean() {
		return configBean.getUrl() + "--" + 
				configBean.getUserName() + "--" + 
				configBean.getPassword();
	}
	
}
