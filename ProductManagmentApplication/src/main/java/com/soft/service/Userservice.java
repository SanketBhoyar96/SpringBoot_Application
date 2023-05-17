package com.soft.service;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestParam;

import com.soft.model.User;

public interface Userservice {
	
	public HashMap<String,Object> userSignUpService(User user);
	public HashMap<String,Object> userSignInInService(String userName,String password);
	

}
