package com.soft.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soft.exception.SignInNotFoundException;
import com.soft.exception.SignUPNotFoundException;
import com.soft.model.User;
import com.soft.service.Userservice;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private Userservice userservice;
	
	@PostMapping("/signUp")
	public HashMap<String,Object> signUp(@RequestBody User user){
		HashMap<String,Object> resopnse=userservice.userSignUpService(user);
		
			return resopnse;			
			
//		if(resopnse.containsValue(true)) {
//		}else {
//			throw new SignUPNotFoundException("User Not SignUp Sucessfully..!")
//		}
		
	}
	
	@GetMapping("/signIn")
	public HashMap<String,Object> singIn(@RequestParam String userName,String password){
		HashMap<String,Object> response =userservice.userSignInInService(userName, password);
		
//		if(response.containsValue(true)) {
			return response;			
//		}else {
//			throw new SignInNotFoundException("User Not SignIn Sucessfully..!");
//		}
		
	}

}
