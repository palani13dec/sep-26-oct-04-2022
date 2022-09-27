package com.intuit.lab01;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculatorController {
	
	@Autowired
	private Calculator calculator;
	
	
	@PostMapping("/multiply")
	public int multiply(@RequestBody CalculatorDto calculatorDto) {
		return calculator.multiply(calculatorDto.getNum1(), calculatorDto.getNum2());
	}
	
	@GetMapping("/sum/{num1}/{num2}")
	public CalcResult sum(@PathVariable int num1, @PathVariable int num2) {
		CalcResult calcResult = new CalcResult();
		calcResult.setNumber1(num1);
		calcResult.setNumber2(num2);
		calcResult.setOperation("add");
		calcResult.setResult(calculator.add(num1, num2));
		return calcResult;
	}
	
	@GetMapping("/operations")
	public List<String> getCalcOperations() {
		return Arrays.asList("add", "square", "subtract", "product");
	}
	
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
