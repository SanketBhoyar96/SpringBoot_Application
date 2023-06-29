package com.soft.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soft.model.StudentModel;
import com.soft.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/register")
	public HashMap<String,Object> RegisterStudent(@RequestBody StudentModel studentModel)
	{  
		HashMap<String,Object> response=studentService.RegisterStudent(studentModel);
		return response;
		
	}
	
	@GetMapping("/login")
	public HashMap<String,Object> LoginStudent(@RequestParam String studEmail,String studPassword){
		 HashMap<String,Object> response= studentService.LoginStudentService(studEmail, studPassword);
		return response;
		
	}
}
