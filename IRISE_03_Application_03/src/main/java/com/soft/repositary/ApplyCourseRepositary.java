package com.soft.repositary;

import java.util.HashMap;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.soft.model.ApplyCourseStudent;

@Repository
public interface ApplyCourseRepositary extends JpaRepository<ApplyCourseStudent,Integer> {
	
	@Query(value ="select * from apply_course_student where email=?1",nativeQuery = true)
	public ApplyCourseStudent findbychechemail(String email);
	

}



