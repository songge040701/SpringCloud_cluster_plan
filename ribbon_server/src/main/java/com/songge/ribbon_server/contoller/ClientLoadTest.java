package com.songge.ribbon_server.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.songge.ribbon_server.service.TaskService;

@RestController
public class ClientLoadTest {

	@Autowired
	TaskService taskService;
	
	@RequestMapping("/client_test")
	public String clientTest() {
		return taskService.workService();
	}
	
	public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
