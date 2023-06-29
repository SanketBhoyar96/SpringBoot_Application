package com.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

	@RequestMapping("/dashboard")
    public String studentDashboard() {
   	 return "studentDashboard";
    }
	
	@RequestMapping("/forgetpass")
    public String forgrtPassword() {
   	 return "forgetPassword";
    }

}
