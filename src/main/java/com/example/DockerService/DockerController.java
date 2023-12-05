package com.example.DockerService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/ab")
public class DockerController {
	
	@GetMapping(path="/cd")
	public String check()
	{
		return "CR7 GOAT";
	}

}
