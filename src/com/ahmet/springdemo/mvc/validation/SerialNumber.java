package com.ahmet.springdemo.mvc.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = SerialNumberConstraintValidator.class)
@Target({ FIELD, METHOD })
@Retention(RUNTIME)
public @interface SerialNumber {

	// define default serial number
	public String value() default "APP";
	
	// define default error message
	public String message() default "must start with APP";	
	
	// define default groups
	public Class<?>[] groups() default {};
	
	// define default payloads
	public Class<? extends Payload>[] payload() default{};
}
