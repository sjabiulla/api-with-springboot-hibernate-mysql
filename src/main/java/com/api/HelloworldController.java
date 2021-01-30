package com.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

	@GetMapping("/message")
	public String getMessage(@RequestParam(required = false, defaultValue = "world") String name) {
		return "Hello " + name;
	}

	@GetMapping("/message/{name}")
	public String getMessagePathVar(@PathVariable(required = false) String name) {
		return "Hello " + name;
	}

}
