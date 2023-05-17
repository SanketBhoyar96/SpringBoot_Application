package com.soft.service;

import java.util.HashMap;
import java.util.List;

import com.soft.entity.User;

public interface UserService {

	public HashMap<String,Object> saveUserService(User user);
	
	public HashMap<String,Object> DeleteByUserService(int userId);
	
	public HashMap<String,Object> UpdateByUserService(int userId,User user);
	
	public HashMap<String,Object> findByUserIdService(int userId);
	
	public HashMap<String ,Object> GetAllUserListService();
	
//	public User LoginUserService(String userName,String password);
	
	public HashMap<String,Object> LoginUserService(String userName,String password);
}
