package com.soft.exception;

public class SignInNotFoundException extends RuntimeException{
	
	public SignInNotFoundException(String message) {
		super(message);
		System.out.println(message);
	}

}
