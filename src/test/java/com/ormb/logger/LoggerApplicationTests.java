package com.ormb.logger;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ormb.logger.resources.MyLoggerResources;
import com.ormb.logger.services.Consumer;

@SpringBootTest
class LoggerApplicationTests {
	
	@Autowired
	private Consumer consumer;
	
	@Autowired
	private MyLoggerResources controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
		assertThat(consumer).isNotNull();
	}

	

}
