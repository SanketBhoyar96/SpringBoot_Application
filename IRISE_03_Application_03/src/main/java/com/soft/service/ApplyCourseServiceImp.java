package com.soft.service;

import java.util.HashMap;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soft.model.ApplyCourseStudent;
import com.soft.model.StudentModel;
import com.soft.repositary.ApplyCourseRepositary;
import com.soft.repositary.StudentRepositary;

@Service
public class ApplyCourseServiceImp implements ApplyCourseService {

	@Autowired
	private ApplyCourseRepositary applyCourseRepositary;

	@Override
	public HashMap<String, Object> savedApplyCourseService(ApplyCourseStudent applyCourseStudent) {
		HashMap<String,Object> serviceResponse = new HashMap<>();
		
		    try {
		    	ApplyCourseStudent savedApplyCourse = applyCourseRepositary.save(applyCourseStudent);
		    	
		    	if(savedApplyCourse != null) {
		    		serviceResponse.put("Massage","ApplyCourse student Sucessfully..!");
					serviceResponse.put("status", true);
					serviceResponse.put("SavedUserData", savedApplyCourse);
		    	}else {
		    		serviceResponse.put("Massage","ApplyCourse NOT Sucessfully..!");
					serviceResponse.put("status", false);
					
		    	}
		    	
		    	
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
		
		return serviceResponse;
	}

	@Override
	public HashMap<String, Object> checkEmail(String email) {
		HashMap<String,Object> serviceResponse=new HashMap<>();
		try {
			ApplyCourseStudent EmailPresentorNOT=applyCourseRepositary.findbychechemail(email);
			
//			StudentModel studmodel = appl
//			ApplyCourseStudent aply = applyCourseRepositary.getById(EmailPresentorNOT)
			
			if(EmailPresentorNOT != null) {
	    		serviceResponse.put("Massage","Stud Email is present Sucessfully..!");
				serviceResponse.put("status", true);
				serviceResponse.put("SavedUserData", EmailPresentorNOT);
	    	}else {
	    		serviceResponse.put("Massage","Stud Email NOT Present Register First..!");
				serviceResponse.put("status", false);
				
	    	}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return serviceResponse; 
	}

	@Override
	public HashMap<String, Object> emailmatchCheckService(int id) {
//		HashMap<String, Object> response = new HashMap();
//		
//		try {
//			Optional<ApplyCourseStudent> exist= applyCourseRepositary.findbychechemail(null)
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		
		return null;
	}
}
