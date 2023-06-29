package com.soft.exception;

public class SignUPNotFoundException extends RuntimeException{

	public SignUPNotFoundException(String message) {
		super(message);
		System.out.println(message);
	}
	
	

}
