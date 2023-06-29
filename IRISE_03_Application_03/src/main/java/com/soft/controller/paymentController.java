package com.soft.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soft.model.StudentPayment;
import com.soft.service.StudentPaymentService;

@RestController
@RequestMapping("/payment")
public class paymentController {

	@Autowired
	private StudentPaymentService studentPaymentService;
	
	@PostMapping("/pymntSaved")
	private HashMap<String,Object> Savedpayment(@RequestBody StudentPayment studentPayment){
		HashMap<String,Object> response=studentPaymentService.savedPayemntService(studentPayment);
		return response;
		
	}
	
}
