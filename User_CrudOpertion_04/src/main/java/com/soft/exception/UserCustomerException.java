package com.soft.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserCustomerException {

	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorMassage>userNotfoundException(){
		
		ErrorMassage error = new ErrorMassage(400,"User Not Deleted plz check Id",new Date());
		
		return new  ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(UserNotFoundByUserIdException.class)
	public ResponseEntity<ErrorMassage>UserNotFindByUserId(){
		
		ErrorMassage error = new ErrorMassage(401,"User Not foun you enter Wrong keyword", new Date());
		
		return new ResponseEntity<ErrorMassage>(error,HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(UserLoginNotFoundException.class)
	public ResponseEntity<ErrorMassage> userLoginNotFoundException(){
		
		ErrorMassage error = new ErrorMassage(400,"UserLogin Not found Sucessfully plz check..!..USERNAME AND PASSWORD);", new Date());
		return new ResponseEntity<ErrorMassage>(error,HttpStatus.NOT_FOUND);
	}
}
