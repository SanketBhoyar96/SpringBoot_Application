package com.soft.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.soft.model.StudentCourse;


public interface CourseService {
	
	public HashMap<String,Object> saveCourseService(StudentCourse studentCourse);
	
	public HashMap<String,Object> updateCourseService(int courseId,StudentCourse studentCourse);
	
	public  List<StudentCourse> getAllCourseService();
	
	public StudentCourse findbyCourseIdService(int courseId);
	
	public HashMap<String,Object> deleteCourseByIdService(int courseId);
		
	}
