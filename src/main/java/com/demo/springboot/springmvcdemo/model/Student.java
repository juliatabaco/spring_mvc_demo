package com.demo.springboot.springmvcdemo.model;

public class Student {
	private String firstName;
	
	/*
	 * (3) Validation 
	 * Added @NotNull and @Size for validation on textbox
	 */
//	@NotNull(message = "is required")
//	@Size(min = 1, message = "is required")
	private String lastName;
	/*
	 * (2) Drop down list demo
	 */
//	private String country;
	
	/*
	 * (5) Custom validation demo
	 * Configured a non-default value and message
	 */
//	@CourseCode(value = "JAVA", message = "must have prefix JAVA")
//	private String courseCode;
	
	public Student() {}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//
//	public String getCourseCode() {
//		return courseCode;
//	}
//
//	public void setCourseCode(String courseCode) {
//		this.courseCode = courseCode;
//	}
}
