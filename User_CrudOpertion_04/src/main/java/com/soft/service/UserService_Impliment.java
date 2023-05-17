package com.soft.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.soft.entity.User;
import com.soft.repositary.UserRepositary;


@Service
public class UserService_Impliment implements UserService{

	
	@Autowired
  private UserRepositary userRepositary;

	@Override
	public HashMap<String, Object> saveUserService(User user) {
		
		HashMap<String, Object> response = new HashMap<>();
		
		try {
			User savedUser = userRepositary.save(user);
			
			if(savedUser != null){
				response.put("Massage","Your register Sucessfully....!");
				response.put("Status", true);
				response.put("User", savedUser);
			}else {
				response.put("Massage","Your not Register Sucessfully....!");
				response.put("Status",false);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return response;
	}

	@Override
	public HashMap<String, Object> DeleteByUserService(int userId) {
		   HashMap<String, Object> response= new HashMap<>();
		   try {
			if(userRepositary.existsById(userId)) {
				userRepositary.deleteById(userId);
				response.put("Massage","User Delete Sucessfully...!");
				response.put("status", true);
				
			}else {
				response.put("Massage","User Not found this!.."+userId+"..userId....!");
				response.put("status", false);
				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return response;
	}

	@Override
	public HashMap<String, Object> UpdateByUserService(int userId, User user) {
		
		HashMap<String,Object> response= new HashMap<>();
		User Us = null;
		Optional<User> UpdateUser;
		try {
			UpdateUser = userRepositary.findById(userId);
			if(UpdateUser.isPresent()) {
				Us = UpdateUser.get();
//				response = us

				Us.setFullName(user.getFullName());
				Us.setAddress(user.getAddress());
				Us.setPhoneNo(user.getPhoneNo());
				Us.setEmail(user.getEmail());
				Us.setUserName(user.getUserName());
				Us.setPassword(user.getPassword());
				userRepositary.save(Us);
				
				response.put("Massage","User Update Sucessfully...!");
				response.put("status",true);
				response.put("User",UpdateUser);
			}else {
				response.put("Massage","User Not Update Sucessfully?? UserId.!-->"+userId);
				response.put("status",false);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return response;
	}

	@Override
	public HashMap<String, Object> findByUserIdService(int userId) {
		HashMap<String,Object> response= new HashMap<>();
		User Us = null;
		Optional<User> checkUserId;
		 
		try {
			checkUserId=userRepositary.findById(userId);
			
			if(checkUserId.isPresent()) {
				Us = checkUserId.get();
				response.put("Massage","User found Sucessfuly UserId is-->"+userId);
				response.put("status",true);
				response.put("User", checkUserId);
			}else {
				response.put("Massage","User NOT found Sucessfuly UserId Is--->"+userId);
				response.put("status",false);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return response;
	}

	@Override
	public HashMap<String ,Object> GetAllUserListService() {
		 HashMap<String ,Object> response = new HashMap<>();
		 
		List<User> getList = userRepositary.findAll();
		response.put("ListOfuser", getList);
		
		 response.put("Massage","get All User Sucessfully..!");
		 response.put("status", true);
		 
		return response;
	}
	
//	@Override
//	public User LoginUserService(String userName, String password) {
//	    User loginService = userRepositary.LoginUserRepositary(userName, password);
//	    
//	      
//	    
//		return loginService;
//	}
//	                                 ORRR

	@Override
	public HashMap<String, Object> LoginUserService(String userName, String password) {
		HashMap<String, Object> response = new HashMap<>();
		
		User store = userRepositary.LoginUserRepositary(userName, password);
           if(store != null) {
        	   
        	   response.put("LoginData", store);
        	   response.put("Massage","User Login Sucessfully..!");
      		 response.put("status", true);
      		 
           }else {
        	   response.put("Massage","Login not Sucessfully..!");
        		 response.put("status", false);
           }
		
		return response;
	}

	


}
