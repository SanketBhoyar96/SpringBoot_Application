package com.soft.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soft.model.ApplyCourseStudent;
import com.soft.service.ApplyCourseService;

@RestController
@RequestMapping("/applyCourseStud")
public class ApplyCourseController {
	
	@Autowired
	private ApplyCourseService applyCourseService;
	
	@PostMapping("/savedApplyCourse")
	private HashMap<String,Object> savedApplyCourse(@RequestBody ApplyCourseStudent applyCourseStudent){
		HashMap<String,Object> savedresponse = applyCourseService.savedApplyCourseService(applyCourseStudent);
		
		return savedresponse;
	}
	
	
	@GetMapping("/emailCheck")
	private HashMap<String,Object> findByemailstud(@RequestParam String email){
		
		HashMap<String,Object> emailCheck=applyCourseService.checkEmail(email);
		
		return emailCheck;
		
	}
	@GetMapping("/emailmatchCheck")
	private HashMap<String,Object> emailmatchCheck(@RequestParam int id){
		
		HashMap<String,Object> emailCheck=null;
		
		return emailCheck;
		
	}

}
