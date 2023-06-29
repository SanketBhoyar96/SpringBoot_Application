package com.soft.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soft.model.StudentModel;
import com.soft.repositary.StudentRepositary;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentRepositary studentRepositary;

	@Override
	public HashMap<String, Object> RegisterStudent(StudentModel studentModel) {
		HashMap<String,Object> serviceResponse = new HashMap<>();
		
		try {
			StudentModel savedStudent = studentRepositary.save(studentModel);
			if(savedStudent != null) {
				serviceResponse.put("Massage","User SignUp Sucessfully..!");
				serviceResponse.put("status", true);
				serviceResponse.put("SavedUserData", savedStudent);
			}else {
				serviceResponse.put("Massage","User Not SignUp Sucessfully..!");
				serviceResponse.put("status", false);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return serviceResponse;
	}

	@Override
	public HashMap<String,Object> LoginStudentService(String studEmail, String studPassword) {
		 
		HashMap<String,Object> serviceResponse = new HashMap<>();
		
		try {
			StudentModel loginStudent = studentRepositary.LoginStudentRepositary(studEmail, studPassword);
			if(loginStudent != null) {
				serviceResponse.put("Massage","User SignIn SucessFully..!");
				serviceResponse.put("status", true);
				serviceResponse.put("SinInUser", loginStudent);
			}else{
				serviceResponse.put("Massage","User Not SignIn SucessFully..!");
				serviceResponse.put("status", false);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return serviceResponse;
	}
}
