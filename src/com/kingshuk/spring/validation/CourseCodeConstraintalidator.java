package com.kingshuk.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintalidator implements ConstraintValidator<CourseCode, String>{
	
	private String courseCodePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		this.courseCodePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext arg1) {
		
		if(theCode==null)
			return true;
		
		return theCode.startsWith(courseCodePrefix);
	}
	
	
	
	
}
