package com.soft.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soft.model.User;
import com.soft.repositary.UserRepositary;

@Service
public class UserServiceImp implements Userservice{
    
	@Autowired
	private UserRepositary userRepositary;

	@Override
	public HashMap<String, Object> userSignUpService(User user) {
		HashMap<String,Object> ServiceResponse=new HashMap();
		
		try {
			User savedUser = userRepositary.save(user);
			
			if(savedUser != null) {
				ServiceResponse.put("Massage", true);
				ServiceResponse.put("Massage","User SignUp Sucessfully..!");
				ServiceResponse.put("SavedUserData", savedUser);
			}else {
				ServiceResponse.put("Massage","User Not SignUp Sucessfully..!");
				ServiceResponse.put("Massage", false);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ServiceResponse;
	}

	@Override
	public HashMap<String, Object> userSignInInService(String userName, String password) {
		HashMap<String,Object> ServiceResponse= new HashMap();
		
		try {
			User signInUser = userRepositary.signInFromRepositary(userName, password);
			if(signInUser != null) {
				ServiceResponse.put("Massage","User SignIn SucessFully..!");
				ServiceResponse.put("status", true);
				ServiceResponse.put("SinInUser", signInUser);
			}else{
				ServiceResponse.put("Massage","User Not SignIn SucessFully..!");
				ServiceResponse.put("status", false);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return ServiceResponse;
	}
	
	
	
}
