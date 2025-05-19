package com.demo.springboot.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	/*
	 * (1.1) Spring MVC Overview
	 */
	@RequestMapping("/showForm")
	public String show() {
		return "helloworld-form";
	}
	
	/*
	 * (1.2) Spring MVC Overview
	 */
	@RequestMapping("/processForm") 
	public String process() {
		return "helloworld";
	}
	
	/*
	 * (2) Adding Data
	 * Comment the function on (1.2) when doing the demo
	 * Converting the entered characters to all uppercase
	 */
//	@RequestMapping("/processForm") 
//	public String process(HttpServletRequest request, Model theModel) {
//		
//		String name = request.getParameter("studentName");
//		name = name.toUpperCase();
//		
//		String result = "Yo! " + name;
//		
//		theModel.addAttribute("message", result);
//		
//		return "helloworld";
//	}
	
	/*
	 * (3) Binding request using @RequestParam
	 * Comment the function on (2) when doing the demo
	 * Converting the entered characters to all uppercase
	 */
//	@RequestMapping("/processForm") 
//	public String process(@RequestParam("studentName") String name, Model theModel) {
//		
//		name = name.toUpperCase();
//		
//		String result = "Hey my friend from v3! " + name;
//		
//		theModel.addAttribute("message", result);
//		
//		return "helloworld";
//	}
	
	/*
	 * (4.1) GetMapping
	 * Comment the function on (1.1) when doing the demo
	 */
//	@GetMapping("/showForm")
//	public String show() {
//		return "helloworld-form";
//	}
	
	/*
	 * (4.2) GetMapping
	 * Comment the function on (1.2) to (3) when doing the demo
	 * Check if helloworld-form form method is GET
	 * Converting the entered characters to all uppercase
	 */
//	@PostMapping("/processForm") 
//	public String process(@RequestParam("studentName") String name, Model theModel) {
//		
//		name = name.toUpperCase();
//		
//		String result = "Hey my friend from v3! " + name;
//		
//		theModel.addAttribute("message", result);
//		
//		return "helloworld";
//	}
}
