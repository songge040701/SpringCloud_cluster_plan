package com.songge.ribbon_server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TaskService {
	
	@Autowired
	RestTemplate restTemplate;
	

	@HystrixCommand(fallbackMethod = "hiError")
	public String workService() {
		return restTemplate.getForObject("http://SONGGE-CLIENT/client_test", String.class)+" from ribbon";
	}
	
	public String hiError() {
		return "error happened";
	}
	
}
