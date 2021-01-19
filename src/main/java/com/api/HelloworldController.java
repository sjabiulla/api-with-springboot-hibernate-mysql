package com.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
	
	@GetMapping("/message")
	public String getMessage( @RequestParam(required = false, defaultValue = "world") String name ) {
		return "Hello "+name;
	}
	
	@GetMapping("/message/{name}")
	public String getMessagePathVar( @PathVariable(required = false) String name ) {
		return "Hello "+name;
	}
	
		
	
	

}
