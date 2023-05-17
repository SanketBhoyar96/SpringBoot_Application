package com.soft.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soft.entity.User;
import com.soft.exception.UserLoginNotFoundException;
import com.soft.exception.UserNotFoundByUserIdException;
import com.soft.exception.UserNotFoundException;
import com.soft.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUser")
	public HashMap<String, Object> saveUserDetails(@RequestBody User user){
		
		HashMap<String,Object> response= userService.saveUserService(user);
		return response;
	}
	
	@DeleteMapping("/deleteUser")
	public HashMap<String,Object> DeleteByUserDetails(@RequestParam int userId){
		HashMap<String,Object> response= userService.DeleteByUserService(userId);
//	======================================HandlingException using Throw customized or userdefine=======================================	
		if(response.containsValue(true)) {
			return response;
			
		}else {
			throw new UserNotFoundException("User Not Delete Sucessfullt..!");
		}
		
//		return response;
//		=============================================================================
		
	}
	@PostMapping("/updateUser")
	public HashMap<String,Object> UpdateByUserDetails(@RequestParam int userId, @RequestBody User user){
		HashMap<String,Object> response= userService.UpdateByUserService(userId, user);
		return response;
		
	}
	
	@GetMapping("/userFindByUserID")
	public HashMap<String,Object> UserFindByuserId(@RequestParam int userId){
		HashMap<String,Object> response= userService.findByUserIdService(userId);
		
		if(response.containsValue(true)) {
			return response;
			
		}else {
			throw new UserNotFoundByUserIdException("User Not Found By UserId-->"+userId);
		}
		
		
	}
	
	@GetMapping("/getAllUserList")
	public HashMap<String ,Object> GetAllUserList(){
		HashMap<String ,Object> getAllUser = userService.GetAllUserListService();
		return getAllUser;
		
	}
	
//	@GetMapping("/loginUser")
//	public User LoginUser(@RequestParam String userName,String password) {
//		     
//		  User loginuser=userService.LoginUserService(userName, password);
//		return loginuser;
//	}
//	                               OR
	@GetMapping("/loginUser")
	public HashMap<String,Object> LoginUser(@RequestParam String userName,String password) {
		     
		HashMap<String,Object> loginuser =userService.LoginUserService(userName, password);
		
		if(loginuser.containsValue(true)) {
			return loginuser;
			
		}else {
			throw new UserLoginNotFoundException("UserLogin Not found Sucessfully..!");
		}
		
	}

}
