package com.kingshuk.spring.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.kingshuk.spring.validation.CourseCode;

public class Customer {
	
	@NotNull(message="Asterisk(*) fields are required")
	private String firstName;
	
	@NotNull(message="Asterisk(*) fields are required")
	@Size(min=1,message="should contain at least 1 character")
	private String lastName;
	
	@Max(value=10,message = "must be less than or equal to 10")
	@Min(value=0,message = "must be greater than or equal to 0")
	@NotNull(message="Asterisk(*) fields are required")
	private Integer freePasses;
	
	@Pattern(regexp = "^[0-9]{6}", message = "must be of length 6 and can only contain numbers")
	@NotNull(message="Asterisk(*) fields are required")
	private String postalCode;
	
	@NotNull(message="Asterisk(*) fields are required")
	@CourseCode(value = "JAVA")
	private String courseCode;

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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
