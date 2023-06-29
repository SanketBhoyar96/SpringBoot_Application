package com.soft.user;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.soft.model.User;
import com.soft.repositary.UserRepositary;

import jakarta.persistence.Transient;

@SpringBootTest
public class UserRepositaryTest {
	
	
	
	@Autowired
    private UserRepositary userRepositary;
    
	@Test
//	@Disabled: test case pass kinva faaild honar nhi run nhi honar
	public void saveUser() {
		User user= new User();
		
		user.setFullName("sanketbhoyar");
		user.setAddress("Butibori");
		user.setEmail("bh@gmail.com");
		user.setPhoneNo(787897897);
		user.setUserName("sankuu");                         //@Transient:- data insert nhi honar annotaion use kely vr db mde null show honar
		user.setPassword("sank123");                         //@colomn:- (nullable=false)
		
		User savedUser = userRepositary.save(user);
		
		assertThat(savedUser);
	}
	
	@Test
	public void findallUser() {
		
		List<User> list = userRepositary.findAll() ;
		
		assertThat(list.size()).isGreaterThan(0);
	}
	
	@Test
	public void findById() {
		
		User existUser= userRepositary.findById(110).get();
		
//		assertNotNull(existUser);
		assertEquals("sanketbhoyar",existUser.getFullName());
		
	}
	
	@Test
	public void deleteById() {
		
		userRepositary.deleteById(115);
		
		assertThat(userRepositary.existsById(115)).isFalse();
	}
	
	@Test
	public void UpdateById() {
		
		User existUser = userRepositary.findById(110).get();
		existUser.setFullName("sanket");
		userRepositary.save(existUser);
		
		assertEquals("sanket",userRepositary.findById(110).get().getFullName());
		
	}
    

}
