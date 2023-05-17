package com.soft.exception;

public class EmployeeNotFoundException extends RuntimeException{

	public EmployeeNotFoundException(String message) {
		super(message);
		System.out.println(message);
	}


	
}
