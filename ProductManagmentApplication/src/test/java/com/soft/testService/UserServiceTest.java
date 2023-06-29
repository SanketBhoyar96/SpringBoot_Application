package com.soft.testService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.soft.model.User;
import com.soft.service.Userservice;

@SpringBootTest
public class UserServiceTest {

	@Autowired
	private Userservice userservice;
	
//	public void SaveUserService() {
//		User user = new User();
//		user.setFullName("abhishek");
//		user.setEmail("abhi@gmail.com");
//		user.setPhoneNo(878979898);
//		user.setUserName("abhiPatil");
//		user.setPassword("abhi@123");
//		User saveService= userservice.sa
//	}
}

