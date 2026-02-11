package com.springboot.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.student.entity.Student;
import com.springboot.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;

	@PostMapping("/register")
	public String insertData(@RequestBody Student s) {
		String msg = service.insertData(s);
		return msg;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable int id) {
		String msg = service.deleteData(id);
		return msg;
	}
	
	@GetMapping("/getSingleData/{id}")
	public Student getSingleData(@PathVariable int id) {
		Student s = service.getSingleData(id);
		return s;
	}
	
}
