package com.pathvariable.path.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentContoller {
 	
	@GetMapping("/student")
   public Student getStudent() {
	   return new Student("Raju","Kaka");
   }
	
	@GetMapping("/student/{firstName}/{lastName}")
	public Student stucentPath(@PathVariable("firstName")String firstName,@PathVariable("lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	@GetMapping("/student/query")
	public Student studentQueryParam(@RequestParam(name = "firstName")String firstName,@RequestParam(name = "lastName")String lastName) {
		return new Student(firstName, lastName);
	}
}
