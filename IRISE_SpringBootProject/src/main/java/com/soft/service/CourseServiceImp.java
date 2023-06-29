package com.soft.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.soft.model.StudentCourse;
import com.soft.repositary.CourseRepositary;

@Service
public class CourseServiceImp  implements CourseService{

	@Autowired
	private CourseRepositary courseRepositary;

	@Override
	public HashMap<String, Object> saveCourseService(StudentCourse studentCourse) {
		 HashMap<String,Object> serviceResponse=new HashMap<>();
		 
		 try {
			   StudentCourse saveCourse = courseRepositary.save(studentCourse);
			   if (saveCourse != null) {
				   serviceResponse.put("Massage","Student SaveCourse Sucessfully..!");
					serviceResponse.put("status", true);
					serviceResponse.put("SavedstudCourse", saveCourse);
			}else {
				serviceResponse.put("Massage","Student Not SaveCourse Sucessfully..!");
				serviceResponse.put("status", false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return serviceResponse;
	}

	@Override
	public HashMap<String, Object> updateCourseService(int courseId, StudentCourse studentCourse) {
		 HashMap<String,Object> serviceResponse=new HashMap<>();
		 Optional<StudentCourse> checkCourse = courseRepositary.findById(courseId);
		 if(checkCourse.isPresent()) {
			 
			 StudentCourse updateCourse = checkCourse.get();
			 updateCourse.setCourseName(studentCourse.getCourseName());
			 updateCourse.setDuration(studentCourse.getDuration());
			 updateCourse.setFees(studentCourse.getFees());
			 
			 serviceResponse.put("UpdateCourse",courseRepositary.save(updateCourse));
			 serviceResponse.put("message","Course Update sucessfully ");
			 serviceResponse.put("status", true);
			 
		 }else {
			 serviceResponse.put("message","Course Update NOT  sucessfully ");
			 serviceResponse.put("status", false);
		 }
		return serviceResponse;
		
			 
	}

	@Override
	public List<StudentCourse> getAllCourseService() {
       List<StudentCourse> getList=courseRepositary.findAll();
		return getList;
	}

	@Override
	public StudentCourse findbyCourseIdService(int courseId) {
		Optional<StudentCourse> checkCourse=courseRepositary.findById(courseId);
		StudentCourse findcourse =null;
		if(checkCourse.isPresent()) {
			findcourse=checkCourse.get();
		}else {
			findcourse=null;
		}
	
		return findcourse;
	}

	@Override
	public HashMap<String, Object> deleteCourseByIdService(int courseId) {
		HashMap<String,Object> serviceResponse=new HashMap<>();
		
		try {
			if(courseRepositary.existsById(courseId)) {
				courseRepositary.deleteById(courseId);
				serviceResponse.put("message","Course Delete Sucessfully");
				serviceResponse.put("status",true);
			}else{
				serviceResponse.put("message","Course Not Delete Sucessfully");
				serviceResponse.put("status",false);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return serviceResponse;
	}
}
