package com.soft.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soft.model.StudentPayment;
import com.soft.repositary.PaymentRepositary;
import com.soft.repositary.StudentRepositary;

@Service
public class StudentPaymentServiceImpl implements StudentPaymentService{

	@Autowired
	private PaymentRepositary paymentRepositary;

	@Override
	public HashMap<String, Object> savedPayemntService(StudentPayment studentPayment) {
                HashMap<String, Object> serviceResponse=new HashMap<>();
		
		      try {
				 StudentPayment Savedpymnt =paymentRepositary.save(studentPayment);
				 if(Savedpymnt != null) {
						serviceResponse.put("Massage","Student Course Payemnt Sucessfully..!");
						serviceResponse.put("status", true);
						serviceResponse.put("SavedUserData", Savedpymnt);
					}else {
						serviceResponse.put("Massage","Paymemt Not  Sucessfully..!");
						serviceResponse.put("status", false);
						
					}
			} catch (Exception e) {
				// TODO: handle exception
			}
		return serviceResponse;
	}
	
	

}
