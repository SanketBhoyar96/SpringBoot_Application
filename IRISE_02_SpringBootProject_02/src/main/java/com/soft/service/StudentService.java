package com.soft.service;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.soft.model.StudentModel;

public interface StudentService {
	
	public HashMap<String,Object> RegisterStudent(StudentModel studentModel);
	public HashMap<String,Object> LoginStudentService(String studEmail,String studPassword);

}
