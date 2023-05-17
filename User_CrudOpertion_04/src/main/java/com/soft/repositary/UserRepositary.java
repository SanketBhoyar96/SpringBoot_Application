package com.soft.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.soft.entity.User;

public interface UserRepositary extends JpaRepository<User, Integer>  {
	
	@Query(value ="select * from user_details where user_name=?1 and password=?2",nativeQuery = true)
	public User LoginUserRepositary(String user_name,String password);

}
