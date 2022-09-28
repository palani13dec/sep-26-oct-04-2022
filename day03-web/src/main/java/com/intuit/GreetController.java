package com.intuit;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class GreetController {

	@PostMapping("/greet")
	public String greetPerson(@RequestParam String firstName, HttpSession session) {
		String message = "Hey " + firstName + "!";
		session.setAttribute("info", message);
		return "result";
	}
}
