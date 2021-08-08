package com.aws.automation.awsproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class AwsDemoController {

	@GetMapping("/check")
	public String getHealthCheck() {
		
		return "Successfully Run the application...";
	}
	
	@GetMapping("/test")
	public String test() {
		
		return "Test Run the application...";
	}
	
}
