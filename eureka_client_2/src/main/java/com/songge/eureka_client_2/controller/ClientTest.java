package com.songge.eureka_client_2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientTest {

	@RequestMapping("/client_test")
	public String clientTest() {
		return "client222";
	}
}
