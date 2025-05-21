package com.demo.springboot.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.springboot.springmvcdemo.model.Student;

@Controller
public class StudentController {
	
	/*
	 * (2.1) Drop down list demo
	 * Add this after configuring countries on application.properties
	 */
//	@Value("${countries}")
//	private List<String> countries;
	
	/*
	 * (1) Spring MVC basic demo
	 */
	@GetMapping("/showStudentForm")
	public String showForm(Model theModel) {
		Student theStudent = new Student();
		
		theModel.addAttribute("student", theStudent);
//		theModel.addAttribute("countries", countries); //add during (2) demo
		
		return "student-form";
	}
	/*
	 * (1) Spring MVC basic demo
	 * Comment this when doing demo (3)
	 */
	@PostMapping("/processStudentForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		return "student-confirmation";
	}
	
	/*
	 * (3) Validation
	 */
//	@PostMapping("/processStudentForm")
//	public String processForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult result, Model theModel) {
//		if(result.hasErrors()) {
//			// re-add the countries when invalidation occurs
//			theModel.addAttribute("countries", countries);
//			return "student-form";
//		} else { 
//			return "student-confirmation";
//		}	
//	}
	
	/*
	 * (4) InitBinder to validate white spaces
	 */
//	@InitBinder
//	public void initBinder(WebDataBinder dataBinder) {
//		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
//		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
//	}
}
