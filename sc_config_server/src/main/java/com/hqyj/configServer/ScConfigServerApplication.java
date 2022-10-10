package com.hqyj.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ScConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScConfigServerApplication.class, args);
	}

}
