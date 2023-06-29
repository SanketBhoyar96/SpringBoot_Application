package com.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@Controller
public class MainController {
         
	@RequestMapping("/")
         public String index() {
        	 return "index";
         }
	
	@RequestMapping("/login")
    public String studLogin() {
   	 return "studLogin";
    }
	
	@RequestMapping("/register")
    public String studRegister() {
   	 return "studRegister";
    }
	
	@RequestMapping("/Header")
    public String Headerpage() {
   	 return "Header";
    }
	
	@RequestMapping("/footer")
    public String footerpage() {
   	 return "footer";
    }

	@RequestMapping("/studdashboard")
    public String studentDashboard() {
   	 return "studentDashboard";
    }
	@RequestMapping("/admindashboard")
    public String adminDashboard() {
   	 return "adminDashboard";
    }
	@RequestMapping("/editcourse")
    public String editCourse() {
   	 return "EditCourse";
    }
	
	@RequestMapping("/addcourse")
    public String addNewCourse() {
   	 return "addNewCourse";
    }

	
	@RequestMapping("/forgetpass")
    public String forgrtPassword() {
   	 return "forgetPassword";
    }
	
	@RequestMapping("/courses")
    public String Courses() {
   	 return "Courses";
    }
	@RequestMapping("/setting")
    public String Setting() {
   	 return "studSetting";
    }
	
	@RequestMapping("/logout")
	public String logout(HttpSession httpSession,HttpServletRequest httpServletRequest) {
		
		httpSession = httpServletRequest.getSession(false);
		if(httpSession != null) {
		  
			httpSession.invalidate();
		}
		
		return "studLogin";
	}

}
