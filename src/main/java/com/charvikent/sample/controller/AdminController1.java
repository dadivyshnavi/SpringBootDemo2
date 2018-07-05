package com.charvikent.sample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class AdminController1 {
	
	@GetMapping("/home1")
	public String showhome1Page()
	{
		
		String str="invalid url";
		System.out.println("enter to jsp page");
		
		
		return "home1";
		
		
	}
	
	
	@PostMapping("/home1")
	public String gethome1Data(HttpServletRequest request)
	{
		String username =request.getParameter("uname"); 
				
		
		String password = request.getParameter("pwd");
		
		
		System.out.println(username+"   "+password);
		
		
		if(username.equals("admin")&& password.equals("admin"))
			
			return "success";
		else
			return "invalid" ;
		
		

}
	
	
	
}
