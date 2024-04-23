package com.example.demop;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demop.controller.DemoController;

@SpringBootTest
class DemopApplicationTests {
    
	@Autowired
	DemoController demoController;
	
	@Test
	void contextLoads() {
		assertThat(demoController).isNotNull();
	}
	

}
