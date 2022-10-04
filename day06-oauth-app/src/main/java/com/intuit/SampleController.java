package com.intuit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/home/{name}")
	public String home(@PathVariable String name) {
		return "Welcome home " + name;
	}
	
	@GetMapping("/hi/{name}")
	public String hi(@PathVariable String name) {
		return "Hi " + name;
	}
}
