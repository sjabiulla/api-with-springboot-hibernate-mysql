package com.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


	@PostMapping("employees")
	public ResponseEntity createUser( @RequestBody Employee employee ){
		
		System.out.println("Empl Name: "+ employee.getName());
		
		// Do business logic
		
//		return ResponseEntity.status(HttpStatus.CREATED).build();
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@GetMapping("/employees")
	public ResponseEntity getUsers( ){
		
		System.out.println("Retrieving all emp ");
		
		// Do business logic
		
//		return ResponseEntity.status(HttpStatus.CREATED).build();
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@GetMapping("/employees/{employeeId}")
	public ResponseEntity getUser( @PathVariable long employeeId ){
		
		System.out.println("Retrieving emp "+employeeId);
		
		// Do business logic
		
//		return ResponseEntity.status(HttpStatus.CREATED).build();
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@PutMapping("/employees/{employeeId}")
	public ResponseEntity updateUser( @RequestBody Employee employee, @PathVariable long employeeId ){
		
		System.out.println("Updating : "+ employeeId);

		// Do business logic
		
//		return ResponseEntity.status(HttpStatus.CREATED).build();
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public ResponseEntity deleteUser(@PathVariable long employeeId ){
		
		System.out.println("Deleting "+employeeId);

		// Do business logic
		
//		return ResponseEntity.status(HttpStatus.CREATED).build();
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	

	
	
}
