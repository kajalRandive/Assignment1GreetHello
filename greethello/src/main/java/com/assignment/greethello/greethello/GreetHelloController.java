package com.assignment.greethello.greethello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetapi/v1")
public class GreetHelloController {
	@GetMapping("/helloname")

	public String greetHelloToName(@RequestBody GreetRequest greetRequest) {
		
		String name=greetRequest.getName();
		String message="Hello ".concat(name);
		return message;
		

	}
}
