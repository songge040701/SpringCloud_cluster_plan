package com.songge.feign_server.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("SONGGE-CLIENT")
public interface SchedualServiceSonggeClient {
	@RequestMapping(value = "/client_test", method = RequestMethod.GET)
	String client_test_feign();
}
