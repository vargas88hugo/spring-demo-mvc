package com.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class) // Helper class that contains business rules
@Target( { ElementType.METHOD, ElementType.FIELD } ) // Type of the annotation that we can apply
@Retention(RetentionPolicy.RUNTIME) // Type of runtime of the decorator
public @interface CourseCode {
	
	// Define default course code
	public String value() default "VAR";
	
	// Define default error message
	public String message() default "must start with VAR";
	
	// Define default groups
	public Class<?>[] groups() default {};
	
	// Define default payloads
	public Class<? extends Payload>[] payload() default {};
}
