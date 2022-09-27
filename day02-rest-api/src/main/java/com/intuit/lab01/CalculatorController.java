package com.intuit.lab01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculatorController {
	
	@Autowired
	private Calculator calculator;
	
	@GetMapping("/add/{num1}/{num2}")
	public int add(@PathVariable int num1, @PathVariable int num2) {
		return calculator.add(num1, num2);
	}
	
	@GetMapping("/square/{num}")
	public int square(@PathVariable int num) {
		return calculator.square(num);
	}
	
	@PutMapping("/subtract/{num1}/{num2}")
	public int subtract(@PathVariable int num1, @PathVariable int num2) {
		return calculator.subtract(num1, num2);
	}
	
	@PostMapping("/product")
	public int product(@RequestParam int num1, @RequestParam int num2) {
		return calculator.multiply(num1, num2);
	}

}
