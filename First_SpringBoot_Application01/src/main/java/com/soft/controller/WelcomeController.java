package com.soft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.soft.model.Employee;

@RestController
@RequestMapping(value = "/welcome")
public class WelcomeController {
	
//	@RequestMapping(value = "/msg", method = RequestMethod.GET);
//	     OR
	
	@GetMapping("/msg")
	public String showMassage() {
		
		return "Welcome to SpringBoot Application";
	}
	
//	-----------------------------------------------------------------------------
	@GetMapping("/getEmp")
	public Employee getEmp() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Sanket");
		emp.setSalary(5000);
		return emp;
	}
	
//	--------------------------------------------------------------------------------
	@PostMapping("/readEmp")
	public String readEmp(@RequestBody Employee emp) {
		
		return "ID::"+emp.getId()+"Name::"+emp.getName()+"salary::"+emp.getSalary()+"";
	}

}
