package com.ahmet.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SerialNumberConstraintValidator 
	implements ConstraintValidator<SerialNumber, String> {
	
	private String serialPrefix;
	
	@Override
	public void initialize(SerialNumber theSerialNumber) {
		serialPrefix=theSerialNumber.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result;
		
		if(theCode != null) {
				
			result=theCode.startsWith(serialPrefix);
		}
		else {
			result=true;
		}
		return result;
	}
	

}
