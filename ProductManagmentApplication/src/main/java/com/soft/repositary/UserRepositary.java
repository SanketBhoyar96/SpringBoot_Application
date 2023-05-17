package com.soft.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.soft.model.User;

@Repository
public interface UserRepositary extends JpaRepository<User,Integer> {

	@Query(value = "SELECT * FROM user_details where user_name=?1 AND password=?2",nativeQuery = true)
	public User signInFromRepositary(String user_name,String password);
}
