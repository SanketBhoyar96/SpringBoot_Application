package com.soft.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserCutomerException {

	@ExceptionHandler(value = UserNotSignUPFoundException.class)
	public ResponseEntity<ErrorMsg>userNotSignUPFoundException(){
		ErrorMsg error = new ErrorMsg(404,"User Not SingUp Sucssfully..!",new Date());
		return new ResponseEntity<ErrorMsg>(error,HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(value = UserNotSignInException.class)
	public ResponseEntity<ErrorMsg>userNotSignInException(){
		ErrorMsg error = new ErrorMsg(401,"User Not SingUp Sucssfully..!check userName AND Password",new Date());
		return new ResponseEntity<ErrorMsg>(error,HttpStatus.NOT_FOUND);
		
	}
}
