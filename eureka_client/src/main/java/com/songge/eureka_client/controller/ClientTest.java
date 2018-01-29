package com.songge.eureka_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientTest {
	
	@Value("${demo.title}")
	private String title;

	@RequestMapping("/client_test")
	public String clientTest() {
		return "client000:"+title;
	}
}
