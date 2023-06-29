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

import com.soft.model.StudentCourse;
import com.soft.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
    private CourseService courseservice;
	
	@PostMapping("/saveCourse")
	private HashMap<String,Object> saveCourse(@RequestBody StudentCourse studentCourse){
		HashMap<String,Object> response=courseservice.saveCourseService(studentCourse);
		return response;
		
	}
	
	@PostMapping("/updateCourse")
	private HashMap<String,Object> updateCourse(@RequestParam int courseId,@RequestBody StudentCourse studentCourse){
		HashMap<String,Object> response =courseservice.updateCourseService(courseId, studentCourse);
		return response;
		
	}
	
	@GetMapping("getAllcourse")
	private List<StudentCourse> getAllCourse(){
		return courseservice.getAllCourseService();
		
	}
	@GetMapping("findbyId")
	private StudentCourse findByCourseId(@RequestParam int courseId) {
		StudentCourse respCourse=courseservice.findbyCourseIdService(courseId);
		return respCourse;
		
	}
	@DeleteMapping("deleteById")
	private HashMap<String,Object> deleteCourseById(@RequestParam int courseId){
		     HashMap<String,Object> response=courseservice.deleteCourseByIdService(courseId);
		return response;
		
	}
}
