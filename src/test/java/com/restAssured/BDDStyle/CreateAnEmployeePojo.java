package com.restAssured.BDDStyle;

import java.util.List;

public class CreateAnEmployeePojo {
	
	
	
	private String FirstName;
	private String LastName;
	private String Email;
	private int Age;
	private List Frients;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public List getFrients() {
		return Frients;
	}
	public void setFrients(List frients) {
		Frients = frients;
	}
	
	

}
