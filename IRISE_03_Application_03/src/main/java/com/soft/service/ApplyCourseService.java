package com.soft.service;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.soft.model.ApplyCourseStudent;

public interface ApplyCourseService {
	
	public HashMap<String,Object> savedApplyCourseService(ApplyCourseStudent applyCourseStudent);
	public HashMap<String,Object> checkEmail(String email);
	
	public HashMap<String,Object> emailmatchCheckService(int id);
}
