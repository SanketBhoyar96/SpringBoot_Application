package com.soft.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeCustomerExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<ErrorMsg> employeNotFoundException() {
		ErrorMsg error = new ErrorMsg(404, "Employee not found thid id", new Date());

		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}

//	@RestControllerAdvice
//	public class EmployeeCustomerDeletedHandlerException {
//
//		@ExceptionHandler(EmployeeNotDelete.class)
//		public ResponseEntity<ErrorMsg> employeeNotDelete() {
//			ErrorMsg error = new ErrorMsg(200, "Employee Not Deleteed thid id", new Date());
//
//			return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//		}
//
//	}
}
