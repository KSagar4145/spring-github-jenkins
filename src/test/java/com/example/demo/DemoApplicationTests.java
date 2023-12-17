package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	private static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);
	
	@Test
	public void contextLoads() {
		logger.info("Test Case Executing");
		logger.info("Test Case Executing second trial........");
		assertEquals(true,true);
	}

}
