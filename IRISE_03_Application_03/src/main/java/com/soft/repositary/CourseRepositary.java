package com.soft.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soft.model.StudentCourse;

@Repository
public interface CourseRepositary extends JpaRepository<StudentCourse,Integer> {

	
}
