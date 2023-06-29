package com.soft.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserNotFoundExceptionHandler {

//	@ExceptionHandler(SignUPNotFoundException.class)
//	public ResponseEntity<ErrorMsg>signNotfOUNDeXCEPTION(){
//		
//		ErrorMsg error = new ErrorMsg(401,"Signup Not Sucessfully..!",new Date());
//		return new  ResponseEntity<ErrorMsg>(error,HttpStatus.NOT_FOUND);
//	}
	
	@ExceptionHandler(SignInNotFoundException.class)
	public ResponseEntity<ErrorMsg>signInNotFoundException(){
		
		ErrorMsg error = new ErrorMsg(401,"SignIn Not Sucessfully..! Check UserName AND Password",new Date());
		return new  ResponseEntity<ErrorMsg>(error,HttpStatus.NOT_FOUND);
	}
}
