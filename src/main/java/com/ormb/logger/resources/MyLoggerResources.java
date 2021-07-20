package com.ormb.logger.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ormb.logger.services.Consumer;

@RestController
public class MyLoggerResources {
	
	@Autowired
	Consumer consumer;
	
	@GetMapping("/health")
	public String healthCheck() {
		return "Health OK";
	}

}
