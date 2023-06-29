package com.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
         
	@RequestMapping("/")
         public String index() {
		System.out.println("this page");
        	 return "index";
         }
	@RequestMapping("/home")
    public String Home() {
   	 return "Home";
    }
//
}
