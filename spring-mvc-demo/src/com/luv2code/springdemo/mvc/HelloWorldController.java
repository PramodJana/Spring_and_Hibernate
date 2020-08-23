package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
@RequestMapping("/hello")
public class HelloWorldController {

	// need a controller method to show the initial html form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	
	//need a controller method to process the html form
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	//new controller method to read form data and
	// add data to the model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		String theName = request.getParameter("studentName");
		
		theName = theName.toUpperCase();
		
		String result = "Yo! " + theName;
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	

	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName
			, Model model) {
				
		theName = theName.toUpperCase();
		
		String result = "Hey My Love " + theName;
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	

	
}
