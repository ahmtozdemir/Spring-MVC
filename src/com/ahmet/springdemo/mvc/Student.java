package com.ahmet.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String sex;
	private String email;
	private String country;
	private String typeComplaint[];
	
	private LinkedHashMap<String, String> countryOptions;

	public Student () {
		
		// populate country for ISO country code 
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("TR","Turkey");
		countryOptions.put("BR","Brazil");
		countryOptions.put("FR","France");
		countryOptions.put("DE","Germany");
		countryOptions.put("IN","India");
	
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

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
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String[] getTypeComplaint() {
		return typeComplaint;
	}

	public void setTypeComplaint(String[] typeComplaint) {
		this.typeComplaint = typeComplaint;
	}
	
	
}
