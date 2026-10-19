package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.StudentsData;

@RestController
public class StudentsDetails {
	
	@GetMapping("print/{type}")
	public char Student(@PathVariable String type) {
		StudentsData s = Factory.createObject(type);
		s.Name();
		s.Address();
		s.Age();
		s.rollNumber();
		s.branch();
		s.MobileNumber();
		return s.Gender();
	}

} 
