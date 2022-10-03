package com.intuit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

	@GetMapping("/square/{num}")
	public int getSquare(@PathVariable int num) {
		return num * num;
	}
}
