package com.soft.exception;

public class UserNotSignInException extends RuntimeException {

	public UserNotSignInException(String message) {
		super(message);
	}
}
