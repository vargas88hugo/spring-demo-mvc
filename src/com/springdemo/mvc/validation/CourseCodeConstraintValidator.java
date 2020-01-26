package com.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	
	private String coursePrefix;
	
	// Method that extract the prefix value
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	/**
	 * This method is the validator process of the form
	 */
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
 		
		boolean result;
		
		if (theCode != null) {
			result = theCode.startsWith(coursePrefix);
		} else {
			result = true;
		}
		
		return result;
	}

}
