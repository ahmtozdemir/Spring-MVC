package com.ahmet.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.ahmet.springdemo.mvc.validation.SerialNumber;

public class Customer {
	
	private String firstName;
	
	@NotNull(message=" required")
	@Size(min=1, message=" required")
	private String lastName;
	
	@SerialNumber(value="APP", message="must start with APP")
	private String serialNumber;
	
	@NotNull(message=" required")
	@Min(value=0, message="must be greater than or equal to zero")
	@Max(value=10, message="must be less than or equal to 10")
	private Integer numberComplaint;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String postalCode;
	
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
	public Integer getNumberComplaint() {
		return numberComplaint;
	}
	public void setNumberComplaint(Integer numberComplaint) {
		this.numberComplaint = numberComplaint;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	
}
