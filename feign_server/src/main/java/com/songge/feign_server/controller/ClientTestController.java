package com.songge.feign_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.songge.feign_server.service.SchedualServiceSonggeClient;

@RestController
public class ClientTestController {
	@Autowired
	SchedualServiceSonggeClient sssc;

	@RequestMapping("/client_test") 
	public String clientTest() {
		return sssc.client_test_feign();
	}
}
