package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class MathController {
	
	@Autowired
	private MathService mathService;
	
	@PostMapping("/square/{num}")
	@HystrixCommand(fallbackMethod = "computeSquareFallback")
	public String computeSquare(@PathVariable int num) {
		System.out.println("******Trying to access math-service");
		int square = mathService.getSquare(num);
		return "Square of " + num + " is " + square;
	}
	
	public String computeSquareFallback(int num) {
		System.out.println("---Executing the fallback method");
		return "Oops! Server is down. Try again later";
	}
}
