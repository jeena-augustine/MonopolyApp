package com.demo.monopoly;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
@RunWith(SpringRunner.class)
@SpringBootTest
class MonopolyAppApplicationTests {

	@Autowired()
	RestTemplate restTemplate;
	
	 @LocalServerPort
	 int randomServerPort;
	     
	
	private String getUrl() {
		return "http://localhost:8080"+randomServerPort+"/roll-die/p2";
	}
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testRollDie() throws URISyntaxException {
		URI uri=new URI(getUrl());
		ResponseEntity<String> message = restTemplate.getForEntity(uri, String.class);
		 Assert.assertEquals(200, message.getStatusCodeValue());
	}

}
