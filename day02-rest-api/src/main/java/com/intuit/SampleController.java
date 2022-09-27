package com.intuit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	//You never right user specific code in controller classes
	//Controller is also a singleton and is shared by all the requests
	
	//http://localhost:8080/hello -> Hi! Hello!
	
	@GetMapping("/hello")
	public String greet() {
		return  "Hi! Hello!";
	}
	
	//http://localhost:8080/bye/Ram -> Bye bye Ram
	//http://localhost:8080/bye/Sam -> Bye bye Sam
	
	@GetMapping("/bye/{name}")
	public String sayBye(@PathVariable("name") String name) {
		return "Bye bye " + name;
	}
	
	//http://localhost:8080/details?name=Sam
	@PostMapping("/details")
	public String getDetails(@RequestParam("name") String name) {
		return "Here are the details for " + name + " ....";
	}
}
