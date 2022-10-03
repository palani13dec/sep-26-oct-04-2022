package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
	
	@Autowired
	private MathService mathService;
	
	@PostMapping("/square/{num}")
	public String computeSquare(@PathVariable int num) {
		int square = mathService.getSquare(num);
		return "Square of " + num + " is " + square;
	}
}
