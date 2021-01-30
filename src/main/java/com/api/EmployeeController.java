package com.api;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private EmployeeRepository repo;

	@PostMapping("employees")
	public ResponseEntity<Employee> createUser(@RequestBody Employee employee) {
		System.out.println("Empl Name: " + employee.getName());
		employee = repo.save(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(employee);
	}

	@GetMapping("/employees")
	public ResponseEntity<?> getUsers() {
		System.out.println("Retrieving all emp ");
		return ResponseEntity.status(HttpStatus.OK).body(repo.findAll());
	}

	@GetMapping("/employees/{employeeId}")
	public ResponseEntity<Employee> getUser(@PathVariable long employeeId) {
		System.out.println("Retrieving emp " + employeeId);
		return ResponseEntity.status(HttpStatus.OK).body(repo.findById(employeeId).get());
	}

	@PutMapping("/employees/{employeeId}")
	public ResponseEntity<Employee> updateUser(@RequestBody Employee employee, @PathVariable long employeeId) {
		System.out.println("Updating : " + employeeId);
		employee.setId(employeeId);
		employee = repo.save(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(employee);
	}

	@DeleteMapping("/employees/{employeeId}")
	public ResponseEntity<?> deleteUser(@PathVariable long employeeId) {
		System.out.println("Deleting " + employeeId);
		repo.deleteById(employeeId);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}
